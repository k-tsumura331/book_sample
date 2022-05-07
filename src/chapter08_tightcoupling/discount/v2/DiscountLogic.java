package chapter08_tightcoupling.discount.v2;

public class DiscountLogic {
  static int getDiscountPrice(int price) {
    int discountPrice = price - 400;
    if (discountPrice < 0) {
      discountPrice = 0;
    }
    return discountPrice;
  }
}
