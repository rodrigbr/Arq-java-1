package br.edu.infnet.vaterinario.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.vaterinario.model.domain.Exame;
import br.edu.infnet.vaterinario.model.repository.ExameRepository;

@Service
public class ExameService {
	
	@Autowired
	private ExameRepository exameRepository;
	
	public Collection<Exame> obterLista(){
		return (Collection<Exame>) exameRepository.findAll();
	}	
	
	public void incluir(Exame exame) {
		exameRepository.save(exame);
	}
	
	public void excluir(Integer chave) {
		exameRepository.deleteById(chave);
	}
	
	public Exame obterPorId(Integer chave) {
		return exameRepository.findById(chave).get();
	}
}
