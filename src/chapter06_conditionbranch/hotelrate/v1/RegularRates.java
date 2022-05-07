package chapter06_conditionbranch.hotelrate.v1;

import chapter06_conditionbranch.hotelrate.Money;

class RegularRates implements HotelRates {
  public Money fee() {
    return new Money(7000);
  }
}
