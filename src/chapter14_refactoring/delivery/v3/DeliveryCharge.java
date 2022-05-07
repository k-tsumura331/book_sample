package chapter14_refactoring.delivery.v3;

class DeliveryCharge {
  final int amount;

  DeliveryCharge(final ShoppingCart shoppingCart) {
    int totalPrice = shoppingCart.products.get(0).price + shoppingCart.products.get(1).price;
    if (totalPrice < 2000) {
      amount = 500;
    }
    else {
      amount = 0;
    }
  }
}
