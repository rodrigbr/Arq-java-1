package br.edu.infnet.vaterinario.model.test;


import br.edu.infnet.vaterinario.model.domain.Vacina;

public class VacinaTeste {

	public static void main(String[] args) {
		
		Vacina vacina1 = new Vacina("Zeca", 85, 3);
		vacina1.setDescricao("Vacina contra doença grave");
		vacina1.setNome("Triplice viral");
		vacina1.setDosagem(20);
		
		System.out.println(vacina1);
		
		Vacina vacina2 = new Vacina("Zeca", 85, 3);
		vacina2.setDescricao("Vacina contra doença grave");
		vacina2.setNome("Triplice viral");
		vacina2.setDosagem(20);

		System.out.println("valor de atendimento = " + vacina2.calcularValorAtendimento());
	}

}
