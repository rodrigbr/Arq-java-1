package br.edu.infnet.vaterinario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.vaterinario.model.domain.Animal;
import br.edu.infnet.vaterinario.model.service.AnimalService;

@Controller
public class AnimalController {
	
	@Autowired
	private AnimalService animalService;
	
	// GET Animal
	@GetMapping(value = "/animal")
	public String cadastro() {
		return "animal/cadastro";
	}
	
	@GetMapping(value = "/animais")
	public String lista(Model model) {
		
		model.addAttribute("listagem", animalService.obterLista());
		return "animal/lista";
	}

	// animal/incluir
	@PostMapping(value = "/animal/incluir")
	public String incluir(Model model, Animal animal) {
		
		System.out.println("GFG" + animal.getIdade() + "gfg");
		animalService.incluir(animal);
		return "redirect:/animais";
	}
}
