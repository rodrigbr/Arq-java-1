package br.edu.infnet.vaterinario.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAnimal")
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String raca;
	private float peso;
	private int idade;
	private String cor;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String nome, String raca, float peso, int idade, String cor) {
		this.nome = nome;
		this.raca = raca;
		this.peso = peso;
		this.idade = idade;
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(nome);
		sb.append(";");
		sb.append(raca);
		sb.append(";");
		sb.append(peso);
		sb.append(";");
		sb.append(idade);
		sb.append(";");
		sb.append(cor);
		sb.append(";");
		
		return sb.toString();
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getRaca() {
		return raca;
	}

	public float getPeso() {
		return peso;
	}

	public int getIdade() {
		return idade;
	}

	public String getCor() {
		return cor;
	}
}
