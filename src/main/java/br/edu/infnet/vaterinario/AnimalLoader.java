package br.edu.infnet.vaterinario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.vaterinario.model.domain.Animal;
import br.edu.infnet.vaterinario.model.service.AnimalService;

@Component
public class AnimalLoader implements ApplicationRunner {

	@Autowired
	private AnimalService animalService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Animal animal = new Animal();
		animal.setCor("branco");
		animal.setIdade(2);
		animal.setNome("Duquesa");
		animal.setPeso(25);
		animal.setRaca("Mastiff");

		animalService.incluir(animal);

		Animal animal2 = new Animal();
		animal2.setCor("preto");
		animal2.setIdade(8);
		animal2.setNome("Luna");
		animal2.setPeso(10);
		animal2.setRaca("Pug");

		animalService.incluir(animal2);

	}

}
