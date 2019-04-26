package datainfo.ws.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "funcao_usuario_externo")
public class FuncaoUsuarioExterno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "co_funcao")
	private Integer id;
	
	@Column(name = "no_funcao")
	private String descricao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
