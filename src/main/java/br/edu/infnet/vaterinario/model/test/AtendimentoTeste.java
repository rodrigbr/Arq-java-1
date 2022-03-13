package br.edu.infnet.vaterinario.model.test;

import br.edu.infnet.vaterinario.model.domain.Exame;
import br.edu.infnet.vaterinario.model.domain.Higiene;
import br.edu.infnet.vaterinario.model.domain.Vacina;

public class AtendimentoTeste {

	public static void main(String[] args) {

		Exame exame = new Exame("Rx da pata", 120, 1);
		Higiene higiene = new Higiene("Corte de unhas", 20, 2);
		Vacina vacina = new Vacina("Triplice viral", 85, 3);

	}

}
