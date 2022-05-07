package chapter06_conditionbranch.hotelrate.v2;

import chapter06_conditionbranch.hotelrate.Money;

interface HotelRates {
  Money fee();
  Money busySeasonFee();  // 繁忙期料金
}
