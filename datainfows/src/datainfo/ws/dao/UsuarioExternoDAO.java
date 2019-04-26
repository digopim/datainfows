package datainfo.ws.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import datainfo.ws.model.UsuarioExterno;

public class UsuarioExternoDAO {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("postgres");
	private final EntityManager em = factory.createEntityManager();;
	
	public UsuarioExterno obterUsuarioExterno(String id) {
		if(id != null && !id.isEmpty()) {
			Integer idInt = Integer.valueOf(id);
			return em.find(UsuarioExterno.class, idInt);
		}
		return null;
	}
	
	public boolean apagarUsuarioExterno (String id) {
		try {
			if(id != null && !id.isEmpty()) {
				Integer idInt = Integer.valueOf(id);
				UsuarioExterno obj = em.find(UsuarioExterno.class, idInt);			
				em.remove(obj);
				return true;
			}
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public List<UsuarioExterno> obterListaPorFiltro(String nome, String situacao, String perfil) {
		StringBuilder sb = new StringBuilder("select u from UsuarioExterno u WHERE 1 = 1 ");
		
		if(nome != null) {
			sb.append(" AND lower(u.nome) LIKE '%").append(nome.toLowerCase()).append("%'");
		}
		
		if(situacao != null) {
			sb.append(" AND lower(u.situacao) = '").append(situacao.toLowerCase()).append("'");
		}
		
		if(perfil != null) {
			try {
				Integer perfilInt = Integer.valueOf(perfil); 
				sb.append(" AND u.perfil = ").append(perfilInt);
			} catch (NumberFormatException e) {
				// caso Não seja numero ignora filtro
			}
		}
		
		return em.createQuery(sb.toString()).getResultList();
	}	
	
}
