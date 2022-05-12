package com.saitej.springdatajpa.patientscheduling.repos;

import com.saitej.springdatajpa.patientscheduling.entities.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository<Appointment,Long> {
}
