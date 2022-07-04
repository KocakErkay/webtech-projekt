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
    //private int anzahlPerson;

    //Rezeptbeschreibung Datentypen etc überlegen (String)
    //Liste mit Zutaten
    //evtl Liste mit Mengen der zutaten oder Mengen der Zutaten aus der oberen Liste rausfiltern

    public Rezept() {}

    public Rezept(String rezeptName, int anzahlPerson) {
        this.rezeptName = rezeptName;
        //this.anzahlPerson = anzahlPerson;
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

    /*public int getAnzahlPerson() {
        return anzahlPerson;
    }

    public void setAnzahlPerson(int anzahlPerson) {
        this.anzahlPerson = anzahlPerson;
    }*/
}
