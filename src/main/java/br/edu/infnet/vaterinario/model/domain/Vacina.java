package br.edu.infnet.vaterinario.model.domain;

import java.time.LocalDateTime;

public class Vacina extends Atendimento {
	
	private int cod_vacina;
	private String nome;
	private String descricao;
	private float valor_vacina;
	private float dosagem;
	private LocalDateTime validade;
	
	public Vacina(String vet_responsavel, float valor, int codigo) {
		super(vet_responsavel, valor, codigo);
	}

	@Override
	public float calcularValorAtendimento() {
		return getValor() + valor_vacina;
	}

	public int getCod_vacina() {
		return cod_vacina;
	}

	public void setCod_vacina(int cod_vacina) {
		this.cod_vacina = cod_vacina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor_vacina() {
		return valor_vacina;
	}

	public void setValor_vacina(float valor_vacina) {
		this.valor_vacina = valor_vacina;
	}

	public float getDosagem() {
		return dosagem;
	}

	public void setDosagem(float dosagem) {
		this.dosagem = dosagem;
	}

	public LocalDateTime getValidade() {
		return validade;
	}

	public void setValidade(LocalDateTime validade) {
		this.validade = validade;
	}

}
