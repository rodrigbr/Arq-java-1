package br.edu.infnet.vaterinario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.vaterinario.model.domain.Higiene;
import br.edu.infnet.vaterinario.model.service.HigieneService;

@Component
public class HigieneLoader implements ApplicationRunner {

	@Autowired
	private HigieneService higieneService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Higiene higiene = new Higiene();
		higiene.setCod_higiene(123);
		higiene.setDescricao("Agua limpa");
		higiene.setNome("Banho");
		higiene.setValor_higiene(25);

		higieneService.incluir(higiene);

		higiene = new Higiene();
		higiene.setCod_higiene(312);
		higiene.setDescricao("Tosa de pelo");
		higiene.setNome("Tosa");
		higiene.setValor_higiene(32);

		higieneService.incluir(higiene);

	}

}
