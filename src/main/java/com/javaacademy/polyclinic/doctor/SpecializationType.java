package com.javaacademy.polyclinic.doctor;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum SpecializationType {
  DENTIST("Стоматолог"),
  SURGEON("Хирург"),
  THERAPIST("Терапевт");

  private final String specialization;
}
