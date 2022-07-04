package de.htw.webtechdemo;

import de.htw.webtechdemo.persistence.Rezept;
import de.htw.webtechdemo.persistence.RezeptRepository;
import de.htw.webtechdemo.service.RezeptService;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class RezeptServiceTest implements WithAssertions {


    @InjectMocks
    RezeptService rezeptService;

    @Mock
    RezeptRepository rezeptRepository;

    @Test
    @DisplayName("should return true if delete was successful")
    void should_return_true_if_delete_was_successful() {
        // given
        Long givenId = 111L;
        doReturn(true).when(rezeptRepository).existsById(givenId);

        // when
        boolean result = rezeptService.deleteById(givenId);

        // then
        verify(rezeptRepository).deleteById(givenId);
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("should return false if recipe to delete does not exist")
    void should_return_false_if_recipe_to_delete_does_not_exist() {
        // given
        Long givenId = 111L;
        doReturn(false).when(rezeptRepository).existsById(givenId);

        // when
        boolean result = rezeptService.deleteById(givenId);

        // then
        verifyNoMoreInteractions(rezeptRepository);
        assertThat(result).isFalse();
    }


}
