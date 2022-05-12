package com.saitej.springdatajpa.patientscheduling.entities;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Insurance {
    private String providerName;
    private double copay;
}
