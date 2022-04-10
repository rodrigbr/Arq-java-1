package br.edu.infnet.vaterinario.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.vaterinario.model.domain.Animal;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Integer> {

}
