package com.example.semwebserver.controller;

import com.example.semwebserver.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PhoneController {

    @Autowired
    private PhoneService service;

    @GetMapping("/get-all")
    public ResponseEntity<String> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

}
