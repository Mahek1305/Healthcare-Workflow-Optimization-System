package com.example.hospitalmanagement.model;

import jakarta.persistence.*;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patientName;
    private String doctorName;
    private String date;
    private String priority; // EMERGENCY, SENIOR, GENERAL
    private int priorityLevel; // 1,2,3

    // getters & setters
    public Long getId() { return id; }
    public String getPatientName() { return patientName; }
    public String getDoctorName() { return doctorName; }
    public String getDate() { return date; }
    public String getPriority() { return priority; }
    public int getPriorityLevel() { return priorityLevel; }

    public void setId(Long id) { this.id = id; }
    public void setPatientName(String patientName) { this.patientName = patientName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }
    public void setDate(String date) { this.date = date; }
    public void setPriority(String priority) { this.priority = priority; }
    public void setPriorityLevel(int priorityLevel) { this.priorityLevel = priorityLevel; }
}