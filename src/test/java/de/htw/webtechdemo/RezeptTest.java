package de.htw.webtechdemo;

import de.htw.webtechdemo.persistence.Rezept;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class RezeptTest {

    /*@Test
    void testToString() {
        //Eingabedaten
        String rezeptName = "Tomatensuppe";
        int anzahlPerson = 2;
        Map<String, Integer> zutaten = new HashMap<String,Integer>();
        zutaten.put("Tomate", 500);

        //"System under test" aufsetzen
        Rezept rezept = new Rezept(rezeptName, anzahlPerson, zutaten);
        rezept.setId(40L);

        //Erwartetes Ergebnis
        String expected = "Rezept{id=40, rezeptName='Tomatensuppe', anzahlPerson=2, zutaten=Tomate,500}";

        //Tatsächliches Ergebnis
        String actual = rezept.toString();

        //Vergleich
        assertEquals(expected, actual);
    }*/
}
