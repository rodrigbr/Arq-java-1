package br.edu.infnet.vaterinario.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.vaterinario.model.domain.Vacina;

@Service
public class VacinaService {
	
	private static Map<Integer, Vacina> mapa = new HashMap<Integer, Vacina>();
	
	private static Integer chave = 1;	

	public Collection<Vacina> obterLista(){
		return mapa.values();
	}	
	
	public void incluir(Vacina vacina) {
		vacina.setId(chave++);
		mapa.put(vacina.getId(), vacina);
	}
	
	public void excluir(Integer chave) {
		mapa.remove(chave);
	}
	
	public Vacina obterPorId(Integer chave) {
		return mapa.get(chave);
	}
}
