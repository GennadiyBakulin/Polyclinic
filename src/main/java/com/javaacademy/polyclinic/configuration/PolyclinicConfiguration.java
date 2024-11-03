package com.javaacademy.polyclinic.configuration;

import com.javaacademy.polyclinic.doctor.Doctor;
import com.javaacademy.polyclinic.doctor.SpecializationType;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PolyclinicConfiguration {

  @Bean
  public Doctor dentist(@Value("${cost-of-appointment.dentist}") Long costOfAppointment) {
    return new Doctor(BigDecimal.valueOf(costOfAppointment), SpecializationType.DENTIST);
  }

  @Bean
  public Doctor therapist(@Value("${cost-of-appointment.therapist}") Long costOfAppointment) {
    return new Doctor(BigDecimal.valueOf(costOfAppointment), SpecializationType.THERAPIST);
  }

  @Bean
  public Doctor juniorSurgeon(
      @Value("${cost-of-appointment.junior-surgeon}") Long costOfAppointment) {
    return new Doctor(BigDecimal.valueOf(costOfAppointment), SpecializationType.SURGEON);
  }

  @Bean
  public Doctor seniorSurgeon(
      @Value("${cost-of-appointment.seniorSurgeon}") Long costOfAppointment) {
    return new Doctor(BigDecimal.valueOf(costOfAppointment), SpecializationType.SURGEON);
  }
}
