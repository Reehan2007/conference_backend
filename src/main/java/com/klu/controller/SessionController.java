package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.klu.model.Session;
import com.klu.service.SessionService;

@RestController
@RequestMapping("/api/sessions")
@CrossOrigin("*")
public class SessionController {

    @Autowired
    private SessionService service;

    @PostMapping
    public Session add(@RequestBody Session s) {
        return service.save(s);
    }

    @GetMapping
    public List<Session> getAll() {
        return service.getAll();
    }
}