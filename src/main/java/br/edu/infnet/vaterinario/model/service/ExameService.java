package br.edu.infnet.vaterinario.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.vaterinario.model.domain.Exame;

@Service
public class ExameService {
	
	private static Map<Integer, Exame> mapa = new HashMap<Integer, Exame>();
	
	private static Integer chave = 1;	

	public Collection<Exame> obterLista(){
		return mapa.values();
	}	
	
	public void incluir(Exame exame) {
		exame.setId(chave++);
		mapa.put(exame.getId(), exame);
	}
	
	public void excluir(Integer chave) {
		mapa.remove(chave);
	}
	
	public Exame obterPorId(Integer chave) {
		return mapa.get(chave);
	}
}
