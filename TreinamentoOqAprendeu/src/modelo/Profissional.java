package modelo;

public class Profissional extends Endereco {
	
	private Integer idProfissional;
	private String nome;
	private String email;
	private String celular;
	public Integer getIdProfissional() {
		return idProfissional;
	}
	public void setIdProfissional(Integer idProfissional) {
		this.idProfissional = idProfissional;
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
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	

}
