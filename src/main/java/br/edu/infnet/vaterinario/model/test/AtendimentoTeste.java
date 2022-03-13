package br.edu.infnet.vaterinario.model.test;

import java.time.LocalDateTime;

import br.edu.infnet.vaterinario.model.domain.Exame;
import br.edu.infnet.vaterinario.model.domain.Higiene;
import br.edu.infnet.vaterinario.model.domain.Vacina;

public class AtendimentoTeste {

	public static void main(String[] args) {

		Exame exame = new Exame("Jorge", 120, 1);
		exame.setDescricao("Exame que analisa os ossos da pata");
		exame.setNome("Rx da pata");
		
		Higiene higiene = new Higiene("Fernando", 20, 2);
		higiene.setDescricao("Corte de unhas com alicate especial");
		higiene.setNome("Corte de unhas");		
		
		Vacina vacina = new Vacina("Zeca", 85, 3);
		vacina.setDescricao("Vacina contra doença grave");
		vacina.setNome("Triplice viral");
		vacina.setDosagem(20);
		vacina.setValidade(LocalDateTime.parse("2023-02-14"));	


	}

}
