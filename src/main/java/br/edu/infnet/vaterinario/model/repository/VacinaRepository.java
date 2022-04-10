package br.edu.infnet.vaterinario.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.vaterinario.model.domain.Vacina;

@Repository
public interface VacinaRepository extends CrudRepository<Vacina, Integer> {

}
