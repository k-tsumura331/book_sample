package chapter06_conditionbranch.hotelrate.v2;

import chapter06_conditionbranch.hotelrate.Money;

public class CallHotelRatesLogic {
  HotelRates hotelRates;
  void method() {
    Money busySeasonFee = hotelRates.busySeasonFee();
  }
}
