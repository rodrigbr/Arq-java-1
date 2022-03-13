package br.edu.infnet.vaterinario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AcaoController {
	// GET Acao
	@GetMapping(value = "/acao")
	public String cadastro() {
		return "acao/cadastro";
	}

	// acao/incluir
	@PostMapping(value = "/acao/incluir")
	public String incluir() {
		return "index";
	}
}
