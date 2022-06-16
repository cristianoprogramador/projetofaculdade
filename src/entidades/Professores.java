package entidades;

public class Professores extends Pessoa {
	private static final long serialVersionUID = 1L;
	
	private Double salario;
	private String materia;
	
	public Professores(String nome, Integer idade, String email, String status, Double salario, String materia) {
		super(nome, idade, email, status);
		this.salario = salario;
		this.materia = materia;
	}
	
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}

	
}
