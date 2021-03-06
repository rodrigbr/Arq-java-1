package br.edu.infnet.vaterinario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.vaterinario.model.domain.Usuario;
import br.edu.infnet.vaterinario.model.service.UsuarioService;

//@SessionAttributes("usuarioLogado")
@Controller
public class AcessoController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping(value = "/")
	public String telaIndex() {
		return "index";
	}

	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}

	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {

		Usuario usuario = usuarioService.validar(email, senha);

		if (usuario != null) {
			model.addAttribute("usuarioLogado", usuario);
			return "index";
		}

		String msg = email + ", Você digitou informações inválidas";

		model.addAttribute("mensagem", msg);

		return "login";
	}

	/*@GetMapping(value = "/logout")
	public String logout(WebRequest request, SessionAttributeStore store,
			SessionStatus status, Model model) {
		status.setComplete();
		store.cleanupAttribute(request, "usuarioLogado");
		model.addAttribute("usuarioLogado", null);
		return "index";
	}*/
	
	@GetMapping(value = "/logout")
	public String logout(Model model) {
		model.addAttribute("usuarioLogado", null);
		return "index";
	}
}
