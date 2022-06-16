package entidades;

public class Alunos extends Pessoa {
	private static final long serialVersionUID = 1L;
	
	private Double mensalidade;
	private String areaDeEstudo;
	
	
	public Alunos(String nome, Integer idade, String email, String status, Double mensalidade, String areaDeEstudo) {
		super(nome, idade, email, status);
		this.mensalidade = mensalidade;
		this.areaDeEstudo = areaDeEstudo;
	}


	public Double getMensalidade() {
		return mensalidade;
	}


	public void setMensalidade(Double mensalidade) {
		this.mensalidade = mensalidade;
	}


	public String getAreaDeEstudo() {
		return areaDeEstudo;
	}


	public void setAreaDeEstudo(String areaDeEstudo) {
		this.areaDeEstudo = areaDeEstudo;
	}
	
	
}
