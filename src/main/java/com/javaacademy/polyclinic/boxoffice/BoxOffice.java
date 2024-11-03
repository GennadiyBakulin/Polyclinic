package com.javaacademy.polyclinic.boxoffice;

import static java.math.BigDecimal.ZERO;

import java.math.BigDecimal;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Setter
@Slf4j
@Component
public class BoxOffice {

  private BigDecimal income = ZERO;

  public void acceptPayments(BigDecimal income) {
    this.income = this.income.add(income);
  }

  public void printIncome() {
    log.info(income.toString());
  }
}
