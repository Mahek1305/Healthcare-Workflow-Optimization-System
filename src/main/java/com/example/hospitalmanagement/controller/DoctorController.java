package com.example.hospitalmanagement.controller;

import com.example.hospitalmanagement.model.Doctor;
import com.example.hospitalmanagement.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/doctors")
@CrossOrigin("*")
public class DoctorController {

    @Autowired
    private DoctorService service;

    @PostMapping
    public Doctor add(@RequestBody Doctor d) {
        return service.save(d);
    }

    @GetMapping
    public List<Doctor> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}