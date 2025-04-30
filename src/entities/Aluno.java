package entities;

import java.sql.Date;
import java.util.List;
	
public class Aluno {
	private int ra;
	private String nome;
	private String sexo;
	private Date dataIngresso;
	private int periodo;
	private double coeficiente;
	private List<Curso> ListaCursos;
	
	public Aluno(int ra, String nome, String sexo, Date dataIngresso, int periodo, double coeficiente) {
		super();
		this.ra = ra;
		this.nome = nome;
		this.sexo = sexo;
		this.dataIngresso = dataIngresso;
		this.periodo = periodo;
		this.coeficiente = coeficiente;
	}
	
	public Aluno() {
		return;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(Date dataIngresso) {
		this.dataIngresso = dataIngresso;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public double getCoeficiente() {
		return coeficiente;
	}

	public void setCoeficiente(double coeficiente) {
		this.coeficiente = coeficiente;
	}
	
	
	
	
}
