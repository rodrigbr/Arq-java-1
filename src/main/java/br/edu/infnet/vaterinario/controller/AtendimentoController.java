package br.edu.infnet.vaterinario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AtendimentoController {
	// GET Animal
	@GetMapping(value = "/atendimento")
	public String cadastro() {
		return "atendimento/cadastro";
	}

	// atendimento/incluir
	@PostMapping(value = "/atendimento/incluir")
	public String incluir() {
		return "index";
	}
}
