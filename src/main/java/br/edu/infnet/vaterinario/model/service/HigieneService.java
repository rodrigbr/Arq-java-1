package br.edu.infnet.vaterinario.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.vaterinario.model.domain.Higiene;

@Service
public class HigieneService {
	
	private static Map<Integer, Higiene> mapa = new HashMap<Integer, Higiene>();
	
	private static Integer chave = 1;	

	public Collection<Higiene> obterLista(){
		return mapa.values();
	}	
	
	public void incluir(Higiene exame) {
		exame.setId(chave++);
		mapa.put(exame.getId(), exame);
	}
	
	public void excluir(Integer chave) {
		mapa.remove(chave);
	}
	
	public Higiene obterPorId(Integer chave) {
		return mapa.get(chave);
	}
}
