package br.edu.infnet.vaterinario.model.test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.vaterinario.model.domain.Acao;
import br.edu.infnet.vaterinario.model.domain.Animal;
import br.edu.infnet.vaterinario.model.domain.Atendimento;
import br.edu.infnet.vaterinario.model.domain.Vacina;

public class AcaoTeste {

	public static void main(String[] args) {

		Animal animal = new Animal("Luna", "Pitbull", 30, 4, LocalDateTime.parse("2014-02-14"), "preto");
 
		Vacina vacina1 = new Vacina("Zeca", 85, 3);
		vacina1.setDescricao("Vacina contra doença grave");
		vacina1.setNome("Triplice viral");
		vacina1.setDosagem(20);
		vacina1.setValidade(LocalDateTime.parse("2023-02-14"));
		
		Vacina vacina2 = new Vacina("Zeca", 85, 3);
		vacina2.setDescricao("Vacina contra doença grave");
		vacina2.setNome("Triplice viral");
		vacina2.setDosagem(20);
		vacina2.setValidade(LocalDateTime.parse("2023-02-14"));	
		
		List<Atendimento> atendimentos = new ArrayList<Atendimento>(); 
		atendimentos.add(vacina1);
		atendimentos.add(vacina2);
		
		Acao acao = new Acao();
		acao.setDescricao("Primeiro atendimento");
		acao.setReincidente(false);
		acao.setAnimal(animal);
		acao.setAtendimentos(atendimentos);
		System.out.println(acao);
	}

}
