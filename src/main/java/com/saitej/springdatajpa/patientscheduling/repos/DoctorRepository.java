package com.saitej.springdatajpa.patientscheduling.repos;

import com.saitej.springdatajpa.patientscheduling.entities.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor,Long> {
}
