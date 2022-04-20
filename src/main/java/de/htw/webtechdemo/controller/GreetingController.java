package de.htw.webtechdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

    @GetMapping(path = "/")
    public ModelAndView showTemplatePage() {
        return new ModelAndView("template");
    }

}
