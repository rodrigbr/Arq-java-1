package br.edu.infnet.vaterinario.model.domain;

import java.time.LocalDateTime;


public class Animal {

	private String nome;
	private String raca;
	private float peso;
	private int idade;
	//private LocalDate nascimento;
	private String cor;
	
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
		//sb.append(nascimento);
		sb.append(";");
		sb.append(cor);
		sb.append(";");
		
		return sb.toString();
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
	public LocalDateTime getNascimento() {
		return null;
	}
	public String getCor() {
		return cor;
	}	
}
