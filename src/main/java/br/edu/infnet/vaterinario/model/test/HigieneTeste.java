package br.edu.infnet.vaterinario.model.test;

import br.edu.infnet.vaterinario.model.domain.Higiene;

public class HigieneTeste {

	public static void main(String[] args) {
		
		Higiene higiene1 = new Higiene("Fernando", 20, 2);
		higiene1.setDescricao("Corte de unhas com alicate especial");
		higiene1.setNome("Corte de unhas");
		
		System.out.println(higiene1);
		
		Higiene higiene2 = new Higiene("Fernando", 20, 2);
		higiene2.setDescricao("Corte de unhas com alicate especial");
		higiene2.setNome("Corte de unhas");		

		System.out.println("valor de atendimento = " + higiene2.calcularValorAtendimento());
	}

}
