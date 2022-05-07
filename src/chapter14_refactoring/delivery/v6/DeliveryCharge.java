package chapter14_refactoring.delivery.v6;

class DeliveryCharge {
  final int amount;

  DeliveryCharge(final ShoppingCart shoppingCart) {
    if (shoppingCart.totalPrice() < 2000) {
      amount = 500;
    }
    else {
      amount = 0;
    }
  }
}
