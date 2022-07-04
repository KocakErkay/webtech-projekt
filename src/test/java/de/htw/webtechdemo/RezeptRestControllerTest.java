package de.htw.webtechdemo;

import de.htw.webtechdemo.persistence.Rezept;
import de.htw.webtechdemo.service.RezeptService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.MediaType;


import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


public class RezeptRestControllerTest {


    /*@Autowired
    private MockMvc mockMvc;

    @MockBean
    private RezeptService rezeptService;

    @Test
    @DisplayName("should return 404 if recipe is not found")
    void should_return_404_if_recipe_is_not_found() throws Exception {
        // given
        doReturn(null).when(rezeptService).get(anyLong());

        // when
        mockMvc.perform(get("/rezepte/4234"))
                // then
                .andExpect(status().isNotFound());
    }

    *//*@Test
    @DisplayName("should return found persons from person service")
    void should_return_found_person_from_person_service() throws Exception {
        // given
        var persons = List.of(
                new Rezept(1, "John", "Doe", "MALE", false, Collections.emptyList()),
                new Rezept(2, "Maria", "Thompson", "FEMALE", true, Collections.emptyList())
        );
        doReturn(persons).when(rezeptService).findAll();

        // when
        mockMvc.perform(get("/api/v1/persons"))
                // then
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()").value(2))
                .andExpect(jsonPath("$[0].id").value(1))
                .andExpect(jsonPath("$[0].firstName").value("John"))
                .andExpect(jsonPath("$[0].lastName").value("Doe"))
                .andExpect(jsonPath("$[0].gender").value("MALE"))
                .andExpect(jsonPath("$[0].vaccinated").value(false))
                .andExpect(jsonPath("$[1].id").value(2))
                .andExpect(jsonPath("$[1].firstName").value("Maria"))
                .andExpect(jsonPath("$[1].lastName").value("Thompson"))
                .andExpect(jsonPath("$[1].gender").value("FEMALE"))
                .andExpect(jsonPath("$[1].vaccinated").value(true));
    }*//*

    @Test
    public void testGetRoute() throws Exception {
        //Test Daten und Service Mock
        Map<String, Integer> zutaten = new HashMap<>();
        zutaten.put("Tomaten", 500);
        Rezept r1 = new Rezept("Tomatensuppe", 2, zutaten);
        r1.setId(42L);
        when(rezeptService.get(42L)).thenReturn(r1);

        //Erwartetes Ergebnis
        String expected = "{\"id\":42,\"rezeptName\":\"Tomatensuppe\",\"anzahlPerson\":2,\"zutaten\",\"Tomaten, 500\"}";

        //Aufruf und Vergleich
        this.mockMvc.perform(get("/rezepte/42"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string(containsString(expected)));
    }*/
}
