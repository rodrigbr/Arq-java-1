package br.edu.infnet.vaterinario.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.vaterinario.model.domain.Animal;
import br.edu.infnet.vaterinario.model.repository.AnimalRepository;

@Service
public class AnimalService {
	
	@Autowired
	private AnimalRepository animalRepository;
	
	public Collection<Animal> obterLista(){
		return (Collection<Animal>) animalRepository.findAll();
	}	
	
	public void incluir(Animal animal) {
		animalRepository.save(animal);
	}
	
	public void excluir(Integer chave) {
		animalRepository.deleteById(chave);
	}
	
	public Animal obterPorId(Integer chave) {
		return animalRepository.findById(chave).get();
	}
}
