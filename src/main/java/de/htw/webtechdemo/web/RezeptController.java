package de.htw.webtechdemo.web;


import de.htw.webtechdemo.service.RezeptService;
import de.htw.webtechdemo.persistence.Rezept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RezeptController {

    @Autowired
    RezeptService service;

    @PostMapping("/rezepte")
    public Rezept createRezept(@RequestBody Rezept rezept) {
        System.out.println("debug: !!!" + rezept);
        return service.save(rezept);
    }


    //TODO: Falls der User versucht, zu manipulieren, indem dieser eine falsche ID im Link eingibt,
    //TODO: soll eine Meldung als String ausgegeben werden und er wird zur vorherigen Seite zurückgeschickt (oder so)
    @GetMapping("/rezepte/{id}")
    public Rezept getRezept (@PathVariable String id) {
        Long rezeptId = Long.parseLong(id);
        return service.get(rezeptId);
    }

    /*@GetMapping("/rezepte")
    public List<Rezept> getAllRezepte() {
        return service.getAll();
    }*/
}
