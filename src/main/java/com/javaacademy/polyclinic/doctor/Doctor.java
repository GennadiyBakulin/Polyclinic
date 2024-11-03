package com.javaacademy.polyclinic.doctor;

import java.math.BigDecimal;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class Doctor {

  private final BigDecimal costOfAppointment;
  private final SpecializationType specialization;

  public BigDecimal treatPerson() {
    log.info("{} вылечил человека", this.specialization.getSpecialization());
    return costOfAppointment;
  }
}
