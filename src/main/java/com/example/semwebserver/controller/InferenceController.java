package com.example.semwebserver.controller;

import com.example.semwebserver.service.impl.InferenceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class InferenceController {

    @Autowired
    private InferenceServiceImpl inferenceService;

    @PostMapping("/inference")
    public ResponseEntity<String> inference() {
        return ResponseEntity.ok(inferenceService.inference());
    }
}
