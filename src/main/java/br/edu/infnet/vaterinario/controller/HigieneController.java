package br.edu.infnet.vaterinario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.vaterinario.model.domain.Higiene;
import br.edu.infnet.vaterinario.model.service.HigieneService;

@Controller
public class HigieneController {
	
	@Autowired
	private HigieneService higieneService;
	
	@GetMapping(value = "/higiene")
	public String cadastro() {
		return "higiene/cadastro";
	}
	
	@GetMapping(value = "/higienes")
	public String lista(Model model) {
		
		model.addAttribute("listagem", higieneService.obterLista());
		return "higiene/lista";
	}

	@PostMapping(value = "/higiene/incluir")
	public String incluir(Model model, Higiene higiene) {
		
		higieneService.incluir(higiene);
		return "redirect:/higienes";
	}
	
	@GetMapping(value = "/higiene/{id}/excluir")
	public String excluir(@PathVariable Integer id ) {
		
		higieneService.excluir(id);
		return "redirect:/higienes";
	}
}
