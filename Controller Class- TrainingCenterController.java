package com.traini8.controller;

import com.traini8.model.TrainingCenter;
import com.traini8.service.TrainingCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

    @Autowired
    private TrainingCenterService service;

    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter center) {
        TrainingCenter savedCenter = service.createTrainingCenter(center);
        return ResponseEntity.ok(savedCenter);
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> centers = service.getAllTrainingCenters();
        return ResponseEntity.ok(centers);
    }
}