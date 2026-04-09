package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.model.Paper;
import com.klu.service.PaperService;
import java.util.List;

@RestController
@RequestMapping("/api/papers")
@CrossOrigin("*")
public class PaperController {

    @Autowired
    private PaperService service;

    @PostMapping
    public Paper submit(@RequestBody Paper p) {
        return service.save(p);
    }

    @GetMapping
    public List<Paper> getAll() {
        return service.getAll();
    }
}