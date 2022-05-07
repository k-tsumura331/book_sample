package chapter08_tightcoupling.commonextend.v2;

class RegularDiscount extends DiscountBase {
  @Override
  protected int discountCharge() {
    return 400;
  }
}
