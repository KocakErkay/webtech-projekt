package de.htw.webtechdemo.service;

import de.htw.webtechdemo.persistence.RezeptRepository;
import de.htw.webtechdemo.persistence.Rezept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RezeptService {

    @Autowired
    RezeptRepository repo;

    public Rezept save(Rezept rezept) {
        return repo.save(rezept);
    }

    public Rezept get(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public boolean deleteById(Long id) {
        if (!repo.existsById(id)) {
            return false;
        }

        repo.deleteById(id);
        return true;
    }

    /*public List<Rezept> findAll() {
        List<Rezept> recipes = repo.findAll();
        return recipes.stream()
                .map(personTransformer::transformEntity)
                .collect(Collectors.toList());
    }*/
}
