package de.htw.webtechdemo.rezeptbuch;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RezeptRepository extends CrudRepository<Rezept, Long> {


}
