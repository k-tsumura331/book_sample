package chapter14_refactoring.delivery.v8;

/**
 * 配送料
 */
class DeliveryCharge {
  private static final int CHARGE_FREE_THRESHOLD = 2000;
  private static final int PAY_CHARGE = 500;
  private static final int CHARGE_FREE = 0;
  final int amount;

  /**
   * @param shoppingCart 買い物かご
   */
  DeliveryCharge(final ShoppingCart shoppingCart) {
    amount = (shoppingCart.totalPrice() < CHARGE_FREE_THRESHOLD) ? PAY_CHARGE : CHARGE_FREE;
  }
}
