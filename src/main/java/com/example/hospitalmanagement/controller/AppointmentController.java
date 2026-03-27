package com.example.hospitalmanagement.controller;

import com.example.hospitalmanagement.model.Appointment;
import com.example.hospitalmanagement.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
@CrossOrigin("*")
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @PostMapping
    public Appointment add(@RequestBody Appointment a) {
        return service.save(a);
    }

    @GetMapping
    public List<Appointment> getAll() {
        return service.getAll();
    }

    @GetMapping("/doctor/{name}")
    public List<Appointment> getByDoctor(@PathVariable String name) {
        return service.getByDoctor(name);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}