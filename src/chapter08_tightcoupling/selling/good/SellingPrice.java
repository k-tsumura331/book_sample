package chapter08_tightcoupling.selling.good;

class SellingPrice {
  final int amount;

  SellingPrice(final int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("価格が0以上でありません。");
    }
    this.amount = amount;
  }
}
