package br.edu.infnet.vaterinario.model.domain;

import java.time.LocalDateTime;

public class Vacina extends Atendimento {

	public Vacina(String vet_responsavel, float valor, int codigo) {
		super(vet_responsavel, valor, codigo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcularValorAtendimento() {
		// TODO Auto-generated method stub
		return 0;
	}

}
