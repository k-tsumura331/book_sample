package chapter04_immutable.finalparam.v2;

public class ImmutableParamLogic {
  int totalPrice;
  static final int MAX_TOTAL_PRICE = 0;

  void addPrice(final int productPrice) {
    final int increasedTotalPrice = totalPrice + productPrice;
    if (MAX_TOTAL_PRICE < increasedTotalPrice) {
      throw new IllegalArgumentException("購入金額の上限を超えています。");
    }
  }
}
