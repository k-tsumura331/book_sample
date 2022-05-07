package chapter06_conditionbranch.hotelrate.v2;

import chapter06_conditionbranch.hotelrate.Money;

class PremiumRates implements HotelRates {
  public Money fee() {
    return new Money(12000);
  }

  public Money busySeasonFee() {
    return fee().add(5000);
  }
}
