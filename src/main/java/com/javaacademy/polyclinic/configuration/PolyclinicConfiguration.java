package com.javaacademy.polyclinic.configuration;

import com.javaacademy.polyclinic.doctor.Doctor;
import com.javaacademy.polyclinic.doctor.SpecializationType;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PolyclinicConfiguration {

  @Value("${doctor.cost.dentist}")
  private long costDentist;
  @Value("${doctor.cost.therapist}")
  private long costTherapist;
  @Value("${doctor.cost.junior-surgeon}")
  private long costJuniorSurgeon;
  @Value("${doctor.cost.senior-surgeon}")
  private long costSeniorSurgeon;

  @Bean
  public Doctor dentist() {
    return new Doctor(BigDecimal.valueOf(costDentist), SpecializationType.DENTIST);
  }

  @Bean
  public Doctor therapist() {
    return new Doctor(BigDecimal.valueOf(costTherapist), SpecializationType.THERAPIST);
  }

  @Bean
  public Doctor juniorSurgeon() {
    return new Doctor(BigDecimal.valueOf(costJuniorSurgeon), SpecializationType.SURGEON);
  }

  @Bean
  public Doctor seniorSurgeon() {
    return new Doctor(BigDecimal.valueOf(costSeniorSurgeon), SpecializationType.SURGEON);
  }
}
