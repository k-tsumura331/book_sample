package chapter08_tightcoupling.commonextend.v1;

class RegularDiscount extends DiscountBase {
  @Override
  int getDiscountedPrice() {
    int discountedPrice = price - 400;
    if (discountedPrice < 0) {
      discountedPrice = 0;
    }
    return discountedPrice;
  }
}
