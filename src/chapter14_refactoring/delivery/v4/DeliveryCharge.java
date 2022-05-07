package chapter14_refactoring.delivery.v4;

class DeliveryCharge {
  final int amount;

  DeliveryCharge(final ShoppingCart shoppingCart) {
    amount = DeliveryManager.deliveryCharge(shoppingCart.products);
  }
}
