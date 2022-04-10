package br.edu.infnet.vaterinario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.vaterinario.model.domain.Vacina;
import br.edu.infnet.vaterinario.model.service.VacinaService;

@Component
public class VacinaLoader implements ApplicationRunner {

	@Autowired
	private VacinaService vacinaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Vacina vacina = new Vacina();
		vacina.setCod_vacina(123);
		vacina.setDescricao("vacina principal");
		vacina.setNome("Triplice");
		vacina.setValor_vacina(25);
		vacina.setDosagem(123);

		vacinaService.incluir(vacina);

		vacina = new Vacina();
		vacina.setCod_vacina(312);
		vacina.setDescricao("vacina raiva");
		vacina.setNome("Raiva");
		vacina.setValor_vacina(33);
		vacina.setDosagem(321);

		vacinaService.incluir(vacina);

	}

}
