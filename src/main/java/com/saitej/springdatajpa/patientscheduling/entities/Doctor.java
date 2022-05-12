package com.saitej.springdatajpa.patientscheduling.entities;

import lombok.Data;


import java.util.List;
import javax.persistence.*;

@Data
@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String speciality;
    @ManyToMany(mappedBy = "doctors")
    private List<Patient> patients;
    @OneToMany
    private List<Appointment> appointments;
}
