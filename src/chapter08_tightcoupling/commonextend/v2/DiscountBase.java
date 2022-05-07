package chapter08_tightcoupling.commonextend.v2;

abstract class DiscountBase {
  int price;
  // 省略

  int getDiscountedPrice() {
    int discountedPrice = price - discountCharge();
    if (discountedPrice < 0) {
      discountedPrice = 0;
    }
    return discountedPrice;
  }

  // 割り引く料金
  protected int discountCharge() {
    return 300;
  }
}