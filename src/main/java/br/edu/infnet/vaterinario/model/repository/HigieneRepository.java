package br.edu.infnet.vaterinario.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.vaterinario.model.domain.Higiene;

@Repository
public interface HigieneRepository extends CrudRepository<Higiene, Integer> {

}
