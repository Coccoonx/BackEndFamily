package com.example.BackEndFamily.controllers;

import com.example.BackEndFamily.models.Personne;
import com.example.BackEndFamily.repository.PersonneRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonneRestController {

    private final PersonneRepository personneRepository;

    public PersonneRestController(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }

    @GetMapping("/Personne")
    Iterable<Personne> PersonneCollection ()
    {
        return this.personneRepository.findAll();
    }
}
