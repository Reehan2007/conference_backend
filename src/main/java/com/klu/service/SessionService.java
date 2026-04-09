package com.klu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.klu.model.Session;
import com.klu.repository.SessionRepository;

@Service
public class SessionService {

    @Autowired
    private SessionRepository repo;

    public Session save(Session s) {
        return repo.save(s);
    }

    public List<Session> getAll() {
        return repo.findAll();
    }
}