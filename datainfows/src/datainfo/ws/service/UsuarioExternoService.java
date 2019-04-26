package datainfo.ws.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import datainfo.ws.dao.UsuarioExternoDAO;
import datainfo.ws.model.UsuarioExterno;

@Path("/usuarios")
@Produces(value = MediaType.APPLICATION_JSON)
public class UsuarioExternoService {
	
	private UsuarioExternoDAO dao = new UsuarioExternoDAO();
	
	private final String MN001 = "Cadastro efetuado com sucesso!";
	private final String MN005 = "Exclus�o efetuada com sucesso.";
	private final String MN030 = "Altera��o efetuada com sucesso!";
	private final String MN031 = "Deseja realmente excluir o usu�rio ";
	private final String MN032 = "Usu�rio desabilitado com sucesso!";
	private final String MN033 = "Usu�rio habilitado com sucesso!";
	private final String MN036 = "Opera��o n�o realizada.";
	private final String MN034 = MN036 + " Usu�rio j� inclu�do.";
	private final String MN035 = MN036 + " CPF digitado � inv�lido.";
	
	@GET
	@Path("{id}")
	public UsuarioExterno obterUsuarioExterno(@PathParam("id") String id) {
		return dao.obterUsuarioExterno(id);
	}
	
	@GET
	public List<UsuarioExterno> obterUsuarios(@Context UriInfo uriInfo) {
		String nome = uriInfo.getQueryParameters().getFirst("nome");
		String situacao = uriInfo.getQueryParameters().getFirst("situacao");
		String perfil = uriInfo.getQueryParameters().getFirst("perfil");
		
		return dao.obterListaPorFiltro(nome, situacao,perfil);
	}
	
	@DELETE
	@Path("{id}")
	public String apagarUsuarioExterno(@PathParam("id") String id) {
		if(dao.apagarUsuarioExterno(id)) {
			return MN005;
		} else {
			return MN036;
		}
	}
	
	@POST
	public String incluirUsuarioExterno(@Context UriInfo uriInfo) {
		//doPOST (Incluir)
		//		Id sequencial
		//		Registros completos no corpo da requisi��o
		return MN036;
	}
	  
	//doPATCH slug /"ID" (Alterar parte)
	//		dados no corpo da requisi��o
		
		
	//doPUT slug /"ID" (Alterar Completo)
	//	  dados no corpo da requisi��o
	  
}
