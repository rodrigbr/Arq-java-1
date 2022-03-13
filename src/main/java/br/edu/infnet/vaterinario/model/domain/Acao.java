package br.edu.infnet.vaterinario.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Acao {
	
	private String descricao;
	private LocalDateTime data;
	private boolean reincidente;
	private List<Atendimento> atendimentos;
	private Animal animal;
	
	public Acao() {
		data = LocalDateTime.now();
		descricao = "Pedido de atendimento veterinário";
		reincidente = true;
	}

	@Override
	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		return String.format("%s;%s;%s;%d", descricao, data.format(formato), reincidente ? "SIM" : "NÃO", atendimentos.size()); 
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isReincidente() {
		return reincidente;
	}

	public void setReincidente(boolean reincidente) {
		this.reincidente = reincidente;
	}

	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(List<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public LocalDateTime getData() {
		return data;
	}
	
}
