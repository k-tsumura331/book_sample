package chapter08_tightcoupling.selling.good;

class ShoppingPoint {
  private static final float SHOPPING_POINT_RATE = 0.01f;
  final int value;

  ShoppingPoint(final SellingPrice sellingPrice) {
    value = (int)(sellingPrice.amount * SHOPPING_POINT_RATE);
  }
}
