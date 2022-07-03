package de.htw.webtechdemo.persistence;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RezeptRepository extends CrudRepository<Rezept, Long> {

    List<Rezept> findAllByRezeptName(String rezeptName);
}
