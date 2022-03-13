package br.edu.infnet.vaterinario.model.domain;

import java.time.LocalDateTime;

public abstract class Atendimento {

	private String vet_responsavel;
	private Exame exame;
	private Higiene higiene;
	private Vacina vacina;
	private float valor;
	private int codigo;
	
	public Atendimento(String vet_responsavel, float valor, int codigo) {
		this.vet_responsavel = vet_responsavel;
		this.valor = valor;
		this.codigo = codigo;
	}
	
	public abstract float calcularValorAtendimento();

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(vet_responsavel);
		sb.append(";");
		sb.append(valor);
		sb.append(";");
		sb.append(codigo);
		sb.append(";");
		
		return sb.toString();
	}
	
	public String getVet_responsavel() {
		return vet_responsavel;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public Exame getExame() {
		return exame;
	}

	public Higiene getHigiene() {
		return higiene;
	}

	public Vacina getVacina() {
		return vacina;
	}

	public float getValor() {
		return valor;
	}
	
	
}
