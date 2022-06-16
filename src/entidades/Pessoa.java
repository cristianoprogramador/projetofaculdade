package entidades;

import java.io.Serializable;

public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Integer idade;
	private String email;
	private String status;
	
	
	public Pessoa(String nome, Integer idade, String email, String status) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.status = status;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", email=" + email + ", status=" + status + "]";
	}
	
	
	
}
