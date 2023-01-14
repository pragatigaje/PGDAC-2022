package com.pragati;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.baeldung.boot.jsp")
public class SprBootCrudAppApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SprBootCrudAppApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SprBootCrudAppApplication.class);
    }
}