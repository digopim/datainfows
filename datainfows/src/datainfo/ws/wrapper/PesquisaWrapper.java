package datainfo.ws.wrapper;

import java.util.List;

import datainfo.ws.model.UsuarioExterno;

public class PesquisaWrapper {

	//Wrapper para paginação
	
	private Integer Qtd_total;
	private Integer Qtd_paginas; 
	private boolean Ultima_Pagina; 
	private boolean Primeira_Pagina; 
	
	private Integer limite;
	private Integer pagina;
	
	public Integer getQtd_total() {
		return Qtd_total;
	}

	public void setQtd_total(Integer qtd_total) {
		Qtd_total = qtd_total;
	}

	public Integer getQtd_paginas() {
		return Qtd_paginas;
	}

	public void setQtd_paginas(Integer qtd_paginas) {
		Qtd_paginas = qtd_paginas;
	}

	public boolean isUltima_Pagina() {
		return Ultima_Pagina;
	}

	public void setUltima_Pagina(boolean ultima_Pagina) {
		Ultima_Pagina = ultima_Pagina;
	}

	public boolean isPrimeira_Pagina() {
		return Primeira_Pagina;
	}

	public void setPrimeira_Pagina(boolean primeira_Pagina) {
		Primeira_Pagina = primeira_Pagina;
	}

	public Integer getLimite() {
		return limite;
	}

	public void setLimite(Integer limite) {
		this.limite = limite;
	}

	public Integer getPagina() {
		return pagina;
	}

	public void setPagina(Integer pagina) {
		this.pagina = pagina;
	}

	public List<UsuarioExterno> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<UsuarioExterno> usuarios) {
		this.usuarios = usuarios;
	}

	private List<UsuarioExterno> usuarios;
	
}
