package chapter08_tightcoupling.commonextend.v1;

// 割引の抽象基底
abstract class DiscountBase {
  protected int price;    // 元値

  // 割引価格を返す
  int getDiscountedPrice() {
    int discountedPrice = price - 300;
    if (discountedPrice < 0) {
      discountedPrice = 0;
    }
    return discountedPrice;
  }
}
