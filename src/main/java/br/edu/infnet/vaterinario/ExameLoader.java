package br.edu.infnet.vaterinario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.vaterinario.model.domain.Exame;
import br.edu.infnet.vaterinario.model.service.ExameService;

@Component
public class ExameLoader implements ApplicationRunner {

	@Autowired
	private ExameService exameService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Exame exame = new Exame();
		exame.setCod_exame(123);
		exame.setDescricao("Exame 1");
		exame.setNome("Exame 1");
		exame.setValor_exame(25);

		exameService.incluir(exame);

		exame = new Exame();
		exame.setCod_exame(312);
		exame.setDescricao("Exame 2");
		exame.setNome("Exame 2");
		exame.setValor_exame(33);

		exameService.incluir(exame);

	}

}
