package de.htw.webtechdemo.web;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("*")
                .allowedOrigins("*");
    }
    //"http://localhost:3000",
    //                        "https://webtech-ss22-rezeptbuch-580339.herokuapp.com/"
    //localhost 3000 ?
}
