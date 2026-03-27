package com.example.hospitalmanagement.service;

import com.example.hospitalmanagement.model.Doctor;
import com.example.hospitalmanagement.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository repo;

    // ✅ ADD DOCTOR
    public Doctor save(Doctor d) {
        return repo.save(d);
    }

    // ✅ GET ALL DOCTORS
    public List<Doctor> getAll() {
        return repo.findAll();
    }

    // ✅ DELETE DOCTOR
    public void delete(Long id) {
        repo.deleteById(id);
    }
}