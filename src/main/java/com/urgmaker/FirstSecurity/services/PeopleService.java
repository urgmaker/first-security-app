package com.urgmaker.FirstSecurity.services;

import com.urgmaker.FirstSecurity.models.Person;
import com.urgmaker.FirstSecurity.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PeopleService {
    private final PeopleRepository peopleRepository;
    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public Optional<Person> findByUsername(String username) {
        Optional<Person> person = peopleRepository.findByUsername(username);
        return Optional.of(person).orElse(null);
    }
}
