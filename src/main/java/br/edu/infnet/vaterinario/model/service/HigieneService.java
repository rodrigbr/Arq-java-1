package br.edu.infnet.vaterinario.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.vaterinario.model.domain.Higiene;
import br.edu.infnet.vaterinario.model.repository.HigieneRepository;

@Service
public class HigieneService {
	
	@Autowired
	private HigieneRepository higieneRepository;
	
	public Collection<Higiene> obterLista(){
		return (Collection<Higiene>) higieneRepository.findAll();
	}	
	
	public void incluir(Higiene higiene) {
		higieneRepository.save(higiene);
	}
	
	public void excluir(Integer chave) {
		higieneRepository.deleteById(chave);
	}
	
	public Higiene obterPorId(Integer chave) {
		return higieneRepository.findById(chave).get();
	}
}
