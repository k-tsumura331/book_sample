package chapter06_conditionbranch.hotelrate.v1;

import chapter06_conditionbranch.hotelrate.Money;

public class TypeCheckLogic {
  HotelRates hotelRates;
  void method() {
    Money busySeasonFee;
    if (hotelRates instanceof RegularRates) {
      busySeasonFee = hotelRates.fee().add(3000);
    }
    else if (hotelRates instanceof PremiumRates) {
      busySeasonFee = hotelRates.fee().add(5000);
    }
  }
}
