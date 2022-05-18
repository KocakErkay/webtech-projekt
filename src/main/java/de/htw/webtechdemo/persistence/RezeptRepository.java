package de.htw.webtechdemo.persistence;


import de.htw.webtechdemo.web.api.Rezept;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RezeptRepository extends CrudRepository<Rezept, Long> {


}
