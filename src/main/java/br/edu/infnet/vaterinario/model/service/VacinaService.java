package br.edu.infnet.vaterinario.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.vaterinario.model.domain.Vacina;
import br.edu.infnet.vaterinario.model.repository.VacinaRepository;

@Service
public class VacinaService {
	
	@Autowired
	private VacinaRepository vacinaRepository;
	
	public Collection<Vacina> obterLista(){
		return (Collection<Vacina>) vacinaRepository.findAll();
	}	
	
	public void incluir(Vacina vacina) {
		vacinaRepository.save(vacina);
	}
	
	public void excluir(Integer chave) {
		vacinaRepository.deleteById(chave);
	}
	
	public Vacina obterPorId(Integer chave) {
		return vacinaRepository.findById(chave).get();
	}
}
