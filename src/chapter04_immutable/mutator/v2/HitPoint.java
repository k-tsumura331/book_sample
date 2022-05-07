package chapter04_immutable.mutator.v2;

class HitPoint {
  private static final int MIN = 0;
  int amount;

  HitPoint(final int amount) {
    if (amount < MIN) {
      throw new IllegalArgumentException();
    }

    this.amount = amount;
  }

  /**
   * ダメージを受ける
   * @param damageAmount ダメージ量
   */
  void damage(final int damageAmount) {
    final int nextAmount = amount - damageAmount;
    amount = Math.max(MIN, nextAmount);
  }

  /** @return ヒットポイントがゼロであればtrue */
  boolean isZero() {
    return amount == MIN;
  }
}
