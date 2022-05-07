package chapter05_lowcohesionseries.magic.v2;

class RegularPrice {
  final int amount;

  /**
   * @param amount 金額
   */
  RegularPrice(final int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException();
    }
    this.amount = amount;
  }
}
