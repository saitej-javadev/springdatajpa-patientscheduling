package com.saitej.springdatajpa.patientscheduling.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    @Embedded
    private Insurance insurance;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "patients_doctors",
            joinColumns = @JoinColumn(name = "patient_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "doctor_id",referencedColumnName = "id"))
    private List<Doctor> doctors;
    @OneToMany
    private List<Appointment> appointments;
}
