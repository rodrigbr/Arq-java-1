package br.edu.infnet.vaterinario.model.domain;

import java.time.LocalDateTime;

public class Exame extends Atendimento{
	
	public Exame(String vet_responsavel, float valor, int codigo) {
		super(vet_responsavel, valor, codigo);
	}

	@Override
	public float calcularValorAtendimento() {
		// TODO Auto-generated method stub
		return 0;
	}

}
