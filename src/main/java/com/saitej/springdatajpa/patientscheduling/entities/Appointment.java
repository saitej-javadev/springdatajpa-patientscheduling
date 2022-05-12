package com.saitej.springdatajpa.patientscheduling.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp appointmentTime;
    private Boolean started;
    private Boolean ended;
    private String reason;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Doctor doctor;
}
