package br.edu.infnet.vaterinario.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.vaterinario.model.domain.Usuario;
import br.edu.infnet.vaterinario.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Usuario validar(String email, String senha) {
		return usuarioRepository.autenticacao(email, senha);
	}
	
	public void incluir (Usuario usuario){
		usuarioRepository.save(usuario);
	}
	
	public void excluir (Integer id){
		usuarioRepository.deleteById(id);
	}
	
	public Collection<Usuario> obterLista(){
		return (Collection<Usuario>) usuarioRepository.findAll();
	}	
	
	public Usuario obterPorId(Integer chave) {
		return usuarioRepository.findById(chave).get();
	}
	
}
