package br.edu.infnet.vaterinario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ExameController {

	// GET Exame
	@GetMapping(value = "/exame")
	public String cadastro() {
		return "exame/cadastro";
	}

	// exame/incluir
	@PostMapping(value = "/exame/incluir")
	public String incluir() {
		return "index";
	}
}
