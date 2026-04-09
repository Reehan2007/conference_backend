package com.klu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.klu.model.Conference;
import com.klu.repository.ConferenceRepository;

@Service
public class ConferenceService {

    @Autowired
    private ConferenceRepository repo;

    public Conference save(Conference c) {
        return repo.save(c);
    }

    public List<Conference> getAll() {
        return repo.findAll();
    }
}