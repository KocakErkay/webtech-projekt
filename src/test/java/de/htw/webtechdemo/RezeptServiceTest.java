package de.htw.webtechdemo;

import de.htw.webtechdemo.persistence.RezeptRepository;
import de.htw.webtechdemo.service.RezeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

public class RezeptServiceTest {


    @Autowired
    RezeptService rezeptService;

    @MockBean
    RezeptRepository rezeptRepository;

}
