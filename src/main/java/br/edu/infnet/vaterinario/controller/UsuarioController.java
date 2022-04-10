package br.edu.infnet.vaterinario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.vaterinario.model.domain.Usuario;
import br.edu.infnet.vaterinario.model.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/usuario")
	public String cadastro() {
		return "usuario/cadastro";
	}
	
	@GetMapping(value = "/usuarioByAdmin")
	public String cadastroByAdmin() {
		return "usuario/cadastroByAdmin";
	}
	
	@GetMapping(value = "/usuarios")
	public String lista(Model model) {		
		model.addAttribute("listagem", usuarioService.obterLista());
		return "usuario/lista";
	}
	
	@PostMapping(value = "/usuario/incluir")
	public String incluir(Model model, Usuario usuario) {
		usuarioService.incluir(usuario);
		return "index";
	}
	
	@PostMapping(value = "/usuario/incluirByAdmin")
	public String incluirByAdmin(Model model, Usuario usuario) {
		usuarioService.incluir(usuario);
		return "redirect:/usuarios";
	}
	
	@GetMapping(value = "/usuario/{id}/excluir")
	public String excluir(@PathVariable Integer id ) {		
		usuarioService.excluir(id);
		return "redirect:/usuarios";
	}
}
