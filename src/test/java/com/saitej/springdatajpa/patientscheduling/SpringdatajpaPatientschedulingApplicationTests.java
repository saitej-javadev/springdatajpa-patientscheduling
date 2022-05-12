package com.saitej.springdatajpa.patientscheduling;
import com.saitej.springdatajpa.patientscheduling.entities.Appointment;
import com.saitej.springdatajpa.patientscheduling.entities.Doctor;
import com.saitej.springdatajpa.patientscheduling.entities.Insurance;
import com.saitej.springdatajpa.patientscheduling.entities.Patient;
import com.saitej.springdatajpa.patientscheduling.repos.AppointmentRepository;
import com.saitej.springdatajpa.patientscheduling.repos.DoctorRepository;
import com.saitej.springdatajpa.patientscheduling.repos.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
@SpringBootTest
class SpringdatajpaPatientschedulingApplicationTests {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private AppointmentRepository appointmentRepository;

    @Test
    void testCreateDoctor() {
        Doctor doctor = new Doctor();
        doctor.setFirstName("ARJUN");
        doctor.setLastName("REDDY");
        doctor.setSpeciality("NEURO-SURGEON");
        doctorRepository.save(doctor);
        assertNotNull(doctor);

    }
    @Test
    void testCreatePatient(){
        Patient patient = new Patient();
        patient.setFirstName("Vamshi");
        patient.setLastName("Krishna");
        patient.setPhone("123456789");
        Insurance insurance = new Insurance();
        insurance.setProviderName("Blue Cross Blue Shield");
        insurance.setCopay(20d);
        patient.setInsurance(insurance);
        Doctor doctor = doctorRepository.findById(1L).orElse(null);
        List<Doctor> doctors = Arrays.asList(doctor);
        patient.setDoctors(doctors);

        patientRepository.save(patient);
        assertNotNull(patient);
    }


    @Test
    void testCreateAppointment() {
        Appointment appointment = new Appointment();
        Timestamp appointmentTime = new Timestamp(new Date().getTime());
        appointment.setAppointmentTime(appointmentTime);
        appointment.setReason("Headache");
        appointment.setStarted(true);
        Patient patient = patientRepository.findById(1L).orElse(null);
        appointment.setPatient(patient);
        Doctor doctor = doctorRepository.findById(1L).orElse(null);
        appointment.setDoctor(doctor);
        appointmentRepository.save(appointment);
        assertNotNull(appointment);
    }
}
