package br.edu.infnet.vaterinario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VacinaController {
	// GET Animal
	@GetMapping(value = "/vacina")
	public String cadastro() {
		return "vacina/cadastro";
	}

	// vacina/incluir
	@PostMapping(value = "/vacina/incluir")
	public String incluir() {
		return "index";
	}
}
