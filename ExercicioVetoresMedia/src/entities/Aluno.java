package entities;

public class Aluno {
	public String aluno;
	public double nota1;
	public double nota2;
	public Aluno(String aluno, double nota1, double nota2) {
		super();
		this.aluno = aluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	public String getAluno() {
		return aluno;
	}
	public void setAluno(String aluno) {
		this.aluno = aluno;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	
}
