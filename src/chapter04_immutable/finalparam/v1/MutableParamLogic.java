package chapter04_immutable.finalparam.v1;

public class MutableParamLogic {
  int totalPrice;
  static final int MAX_TOTAL_PRICE = 0;

  void addPrice(int productPrice) {
    productPrice = totalPrice + productPrice;
    if (MAX_TOTAL_PRICE < productPrice) {
      throw new IllegalArgumentException("購入金額の上限を超えています。");
    }
  }
}
