package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.klu.model.Conference;
import com.klu.service.ConferenceService;

@RestController
@RequestMapping("/api/conferences")
@CrossOrigin("*")
public class ConferenceController {

    @Autowired
    private ConferenceService service;

    @PostMapping
    public Conference add(@RequestBody Conference c) {
        return service.save(c);
    }

    @GetMapping
    public List<Conference> getAll() {
        return service.getAll();
    }

}