package de.htw.webtechdemo.persistence;


import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Rezept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rezeptName;
    @ElementCollection
    private Map<String, Integer> zutaten = new HashMap<String,Integer>();
    private int anzahlPerson;


    public Rezept() {}

    public Rezept(String rezeptName, int anzahlPerson, Map<String, Integer> zutaten) {
        this.rezeptName = rezeptName;
        this.anzahlPerson = anzahlPerson;
        this.zutaten = zutaten;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRezeptName() {
        return rezeptName;
    }

    public void setRezeptName(String rezeptName) {
        this.rezeptName = rezeptName;
    }

    public int getAnzahlPerson() {
        return anzahlPerson;
    }

    public void setAnzahlPerson(int anzahlPerson) {
        this.anzahlPerson = anzahlPerson;
    }

    public Map<String, Integer> getZutaten() {
        return zutaten;
    }

    public void setZutaten(Map<String, Integer> zutaten) {
        this.zutaten = zutaten;
    }
}
