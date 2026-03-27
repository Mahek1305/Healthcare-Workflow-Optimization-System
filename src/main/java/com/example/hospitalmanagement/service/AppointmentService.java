package com.example.hospitalmanagement.service;

import com.example.hospitalmanagement.model.Appointment;
import com.example.hospitalmanagement.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository repo;

    public Appointment save(Appointment a) {

        // 🔥 PRIORITY LOGIC
        if (a.getPriority().equalsIgnoreCase("EMERGENCY")) {
            a.setPriorityLevel(1);
        } else if (a.getPriority().equalsIgnoreCase("SENIOR")) {
            a.setPriorityLevel(2);
        } else {
            a.setPriorityLevel(3);
        }

        return repo.save(a);
    }

    public List<Appointment> getAll() {
        return repo.findAll(Sort.by("priorityLevel").ascending());
    }

    public List<Appointment> getByDoctor(String name) {

        List<Appointment> list = repo.findByDoctorName(name);

        if (list.isEmpty()) {
            throw new RuntimeException("Doctor does not exist or no appointments");
        }

        return list;
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}