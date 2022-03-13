package br.edu.infnet.vaterinario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HigieneController {
	// GET Animal
	@GetMapping(value = "/higiene")
	public String cadastro() {
		return "higiene/cadastro";
	}

	// higiene/incluir
	@PostMapping(value = "/higiene/incluir")
	public String incluir() {
		return "index";
	}
}
