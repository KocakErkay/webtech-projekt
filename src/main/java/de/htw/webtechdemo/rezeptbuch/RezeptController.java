package de.htw.webtechdemo.rezeptbuch;


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

    @GetMapping("/rezepte/{id}")
    public Rezept getRezept (@PathVariable String id) {
        Long rezeptId = Long.parseLong(id);
        return service.get(rezeptId);
    }
}
