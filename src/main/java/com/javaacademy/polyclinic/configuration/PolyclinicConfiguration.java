package com.javaacademy.polyclinic.configuration;

import com.javaacademy.polyclinic.doctor.Doctor;
import com.javaacademy.polyclinic.doctor.SpecializationType;
import java.math.BigDecimal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PolyclinicConfiguration {

  @Bean
  public Doctor dentist() {
    return new Doctor(BigDecimal.valueOf(1500), SpecializationType.DENTIST);
  }

  @Bean
  public Doctor therapist() {
    return new Doctor(BigDecimal.valueOf(500), SpecializationType.THERAPIST);
  }

  @Bean
  public Doctor juniorSurgeon() {
    return new Doctor(BigDecimal.valueOf(700), SpecializationType.SURGEON);
  }

  @Bean
  public Doctor seniorSurgeon() {
    return new Doctor(BigDecimal.valueOf(2000), SpecializationType.SURGEON);
  }
}
