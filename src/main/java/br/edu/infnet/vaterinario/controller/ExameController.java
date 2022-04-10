package br.edu.infnet.vaterinario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.vaterinario.model.domain.Exame;
import br.edu.infnet.vaterinario.model.service.ExameService;

@Controller
public class ExameController {

	@Autowired
	private ExameService exameService;
	
	@GetMapping(value = "/exame")
	public String cadastro() {
		return "exame/cadastro";
	}
	
	@GetMapping(value = "/exames")
	public String lista(Model model) {
		
		model.addAttribute("listagem", exameService.obterLista());
		return "exame/lista";
	}

	@PostMapping(value = "/exame/incluir")
	public String incluir(Model model, Exame exame) {
		
		exameService.incluir(exame);
		return "redirect:/exames";
	}
	
	@GetMapping(value = "/exame/{id}/excluir")
	public String excluir(@PathVariable Integer id ) {
		
		exameService.excluir(id);
		return "redirect:/exames";
	}
}
