package de.htw.webtechdemo;

import de.htw.webtechdemo.service.RezeptService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class RezeptRestControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RezeptService rezeptService;

    @Test
    @DisplayName("should return 404 if person is not found")
    void should_return_404_if_recipe_is_not_found() throws Exception {
        // given
        doReturn(null).when(rezeptService).get(anyLong());

        // when
        mockMvc.perform(get("/rezepte/4234"))
                // then
                .andExpect(status().isNotFound());
    }
}
