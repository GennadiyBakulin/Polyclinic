package com.javaacademy.polyclinic.polyclinic;

import com.javaacademy.polyclinic.boxoffice.BoxOffice;
import com.javaacademy.polyclinic.doctor.Doctor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class Polyclinic {

  private final BoxOffice boxOffice;
  private final Doctor dentist;
  private final Doctor therapist;
  private final Doctor juniorSurgeon;
  private final Doctor seniorSurgeon;

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
