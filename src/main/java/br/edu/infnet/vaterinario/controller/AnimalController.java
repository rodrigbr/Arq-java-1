package br.edu.infnet.vaterinario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AnimalController {
	// GET Animal
	@GetMapping(value = "/animal")
	public String cadastro() {
		return "animal/cadastro";
	}

	// animal/incluir
	@PostMapping(value = "/animal/incluir")
	public String incluir() {
		return "index";
	}
}
