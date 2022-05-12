package com.saitej.springdatajpa.patientscheduling.repos;

import com.saitej.springdatajpa.patientscheduling.entities.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient,Long> {
}
