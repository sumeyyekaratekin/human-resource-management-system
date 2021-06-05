package com.sumeyye.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumeyye.hrms.business.abstracts.JobPositionService;
import com.sumeyye.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionController {
    private final JobPositionService jobPositionService;

    @Autowired
    public JobPositionController(JobPositionService jobPositionService) {
        this.jobPositionService = jobPositionService;
    }

    @GetMapping("/getall")
    public List<JobPosition> getAll(){
        return jobPositionService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody JobPosition jobPosition){
        jobPositionService.add(jobPosition);
    }
}