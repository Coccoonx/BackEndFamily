package com.example.BackEndFamily;

import com.example.BackEndFamily.models.Personne;
import com.example.BackEndFamily.repository.PersonneRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class BackEndFamilyApplication {
    //un simple commentaire pour commiter les données!

    @Bean
    ApplicationRunner run(PersonneRepository pr) {
        return args ->
                Stream.of("boris", "blondelle", "sophie", "cissoko")
                        .forEach(x -> pr.save(new Personne(null, x, x)));
    }

    public static void main(String[] args) {
        SpringApplication.run(BackEndFamilyApplication.class, args);
    }


}

/*
@Component
class CustomHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return Health.status("I <3 production").build();
    }
}*/
