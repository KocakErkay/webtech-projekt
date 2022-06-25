package de.htw.webtechdemo.persistence;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RezeptRepository extends CrudRepository<Rezept, Long> {


}
