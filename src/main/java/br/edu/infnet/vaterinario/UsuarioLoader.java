package br.edu.infnet.vaterinario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.vaterinario.model.domain.Usuario;
import br.edu.infnet.vaterinario.model.service.UsuarioService;

@Component
public class UsuarioLoader implements ApplicationRunner{

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setAdmin(true);
		usuario.setEmail("vet1@teste.com");
		usuario.setNome("usuario VET 1");
		usuario.setSenha("123");
		
		usuarioService.incluir(usuario);
		
		Usuario usuario2 = new Usuario();
		usuario2.setAdmin(false);
		usuario2.setEmail("vet2@teste.com");
		usuario2.setNome("usuario VET 2");
		usuario2.setSenha("123");
		
		usuarioService.incluir(usuario2);
		
	}
}
