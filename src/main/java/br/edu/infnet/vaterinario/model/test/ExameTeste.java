package br.edu.infnet.vaterinario.model.test;

import br.edu.infnet.vaterinario.model.domain.Exame;

public class ExameTeste {

	public static void main(String[] args) {
		
		Exame exame1 = new Exame("Jorge", 120, 1);
		exame1.setDescricao("Exame que analisa os ossos da pata");
		exame1.setNome("Rx da pata");
		

		System.out.println(exame1);
		
		Exame exame2 = new Exame("Jorge", 120, 1);
		exame2.setDescricao("Exame que analisa os ossos da pata");
		exame2.setNome("Rx da pata");
		

		System.out.println("valor de atendimento = " + exame2.calcularValorAtendimento());


	}

}
