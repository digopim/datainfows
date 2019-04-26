package datainfo.ws.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario_externo")
public class UsuarioExterno {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "nu_cpf", nullable = false, unique = true, length = 11)
	private String cpf; 
	
	@Column(name = "no_usuario", nullable = false, length = 60)
	private String nome;
	
	@Column(name = "de_email", nullable = false, length = 255)
	private String email;
	
	@Column(name = "ic_situacao", nullable = false, length = 1)
	private String situacao;
	
	@Column(name = "ic_perfil_acesso", nullable = false)
	private Integer perfil;
	
	@ManyToOne
	@JoinColumn(name = "co_funcao")
	private FuncaoUsuarioExterno funcao;
	
	@Column(name = "nu_telefone", length = 11)
	private String telefone;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public Integer getPerfil() {
		return perfil;
	}
	public void setPerfil(Integer perfil) {
		this.perfil = perfil;
	}
	public FuncaoUsuarioExterno getFuncao() {
		return funcao;
	}
	public void setFuncao(FuncaoUsuarioExterno funcao) {
		this.funcao = funcao;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
