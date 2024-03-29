package fatecfranca.edu.br.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// precisamos informar que esta classe é uma tabela no banco de dados
@Entity // decorator
@Table(name="paciente")
public class Paciente {
	@Id // chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY) // geração automática de chave 
	private Long id;
	@Column(name="cpf")
	private String cpf;
	@Column(name="idade")
	private int idade;
	@Column(name="peso")
	private float peso;
	@Column(name="altura")
	private float altura;
	
	public Paciente() {
		
	}
	
	public Paciente(Long id, String cpf, int idade, float peso, float altura) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
}
