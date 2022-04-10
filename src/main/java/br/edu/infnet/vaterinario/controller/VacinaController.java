package br.edu.infnet.vaterinario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.vaterinario.model.domain.Vacina;
import br.edu.infnet.vaterinario.model.service.VacinaService;

@Controller
public class VacinaController {
	
	@Autowired
	private VacinaService vacinaService;
	
	@GetMapping(value = "/vacina")
	public String cadastro() {
		return "vacina/cadastro";
	}
	
	@GetMapping(value = "/vacinas")
	public String lista(Model model) {
		
		model.addAttribute("listagem", vacinaService.obterLista());
		return "vacina/lista";
	}

	@PostMapping(value = "/vacina/incluir")
	public String incluir(Model model, Vacina vacina) {
		
		vacinaService.incluir(vacina);
		return "redirect:/vacinas";
	}
	
	@GetMapping(value = "/vacina/{id}/excluir")
	public String excluir(@PathVariable Integer id ) {
		
		vacinaService.excluir(id);
		return "redirect:/vacinas";
	}
}
