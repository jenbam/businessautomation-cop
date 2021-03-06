package com.redhat.cop.pam.example3.springboot;

import com.redhat.cop.pam.example3.kie.api.RulesApi;
import com.redhat.cop.pam.example3.kie.api.impl.RulesApiImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public RulesApi initRulesApi() {
        return new RulesApiImpl();
    }

}
