package com.javaacademy.polyclinic.polyclinic;

import com.javaacademy.polyclinic.boxoffice.BoxOffice;
import com.javaacademy.polyclinic.doctor.Doctor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Polyclinic {

  private final BoxOffice boxOffice;
  @Qualifier(value = "dentist")
  private final Doctor dentist;
  @Qualifier(value = "therapist")
  private final Doctor therapist;
  @Qualifier(value = "juniorSurgeon")
  private final Doctor juniorSurgeon;
  @Qualifier(value = "seniorSurgeon")
  private final Doctor seniorSurgeon;

  public Polyclinic(BoxOffice boxOffice, Doctor dentist, Doctor therapist, Doctor juniorSurgeon,
      Doctor seniorSurgeon) {
    this.boxOffice = boxOffice;
    this.dentist = dentist;
    this.therapist = therapist;
    this.juniorSurgeon = juniorSurgeon;
    this.seniorSurgeon = seniorSurgeon;
  }

  public void treatWithDentist() {
    boxOffice.acceptPayments(dentist.treatPerson());
  }

  public void treatWithTherapist() {
    boxOffice.acceptPayments(therapist.treatPerson());
  }

  public void treatWithJuniorSurgeon() {
    boxOffice.acceptPayments(juniorSurgeon.treatPerson());
  }

  public void treatWithSeniorSurgeon() {
    boxOffice.acceptPayments(seniorSurgeon.treatPerson());
  }
}
