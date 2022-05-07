package chapter05_lowcohesionseries.location.v1;

class DiscountManager {
  // 割引を適用する
  void set(MoneyData money) {
    money.amount -= 2000;
    if (money.amount < 0) {
      money.amount = 0;
    }
  }
}
