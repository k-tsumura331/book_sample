package chapter08_tightcoupling.discount.v3;

class RegularPrice {
  private static final int MIN_AMOUNT = 0;
  final int amount;

  RegularPrice(final int amount) {
    if (amount < MIN_AMOUNT) {
      throw new IllegalArgumentException("価格が0以上でありません。");
    }

    this.amount = amount;
  }
}
