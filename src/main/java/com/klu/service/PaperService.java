package com.klu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.model.Paper;
import com.klu.repository.PaperRepository;

import java.util.List;

@Service
public class PaperService {

    @Autowired
    private PaperRepository repo;

    public Paper save(Paper p) {
        return repo.save(p);
    }

    public List<Paper> getAll() {
        return repo.findAll();
    }
}