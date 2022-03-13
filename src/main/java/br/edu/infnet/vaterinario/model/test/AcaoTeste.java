package br.edu.infnet.vaterinario.model.test;

import java.time.LocalDateTime;

import br.edu.infnet.vaterinario.model.domain.Acao;
import br.edu.infnet.vaterinario.model.domain.Animal;

public class AcaoTeste {

	public static void main(String[] args) {

		Animal animal = new Animal("Luna", "Pitbull", 30, 4, LocalDateTime.parse("2014-02-14"), "preto");
 
		Acao acao = new Acao();
		acao.setDescricao("Primeiro atendimento");
		acao.setReincidente(false);
		acao.setAnimal(animal);
		acao.setAtendimentos(null);
		System.out.println(acao);
	}

}
