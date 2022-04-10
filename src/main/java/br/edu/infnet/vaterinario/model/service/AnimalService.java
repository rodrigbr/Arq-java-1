package br.edu.infnet.vaterinario.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.vaterinario.model.domain.Animal;

@Service
public class AnimalService {
	
	private static Map<Integer, Animal> mapa = new HashMap<Integer, Animal>();
	
	private static Integer chave = 1;	
	
/*	List<Animal> animais = new ArrayList<Animal>();
	
	Animal a1 = new Animal("Luna", "Mastiff",30,8,LocalDateTime.now(),"Branco");
	Animal a2 = new Animal("Bela", "Mastiff",30,8,LocalDateTime.now(),"Branco");
	Animal a3 = new Animal("Condy", "Mastiff",30,8,LocalDateTime.now(),"Branco");
	Animal a4 = new Animal("Rex", "Mastiff",30,8,LocalDateTime.now(),"Branco");
	
	animais.add(a4);
	animais.add(a3);
	animais.add(a2);
	animais.add(a1);
	
	return animais;
*/	
	public Collection<Animal> obterLista(){
		return mapa.values();
	}	
	
	public void incluir(Animal animal) {
		mapa.put(++chave, animal);
	}
	
	public void excluir(Integer chave) {
		mapa.remove(chave);
	}
	
	public Animal obterPorId(Integer chave) {
		return mapa.get(chave);
	}
}
