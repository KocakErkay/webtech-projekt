package de.htw.webtechdemo.rezeptbuch;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rezept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rezeptName;
    private int anzahlPerson;
    //Rezeptbeschreibung Datentypen etc überlegen

    public Rezept() {}

    public Rezept(String rezeptName, int anzahlPerson) {
        this.rezeptName = rezeptName;
        this.anzahlPerson = anzahlPerson;
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
}
