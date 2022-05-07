package chapter05_lowcohesionseries.gift.v1;

import chapter05_lowcohesionseries.gift.ConsumptionPoint;

class GiftPoint {
  private static final int MIN_POINT = 0;
  final int value;

  GiftPoint(final int point) {
    if (point < MIN_POINT) {
      throw new IllegalArgumentException("ポイントが0以上ではありません。");
    }

    value = point;
  }

  /**
   * ポイントを加算する。
   *
   * @param other 加算ポイント
   * @return 加算後の残余ポイント
   */
  GiftPoint add(final GiftPoint other) {
    return new GiftPoint(value + other.value);
  }

  /**
   * @return 残余ポイントが消費ポイント以上であればtrue
   */
  boolean isEnough(final ConsumptionPoint point) {
    return point.value <= value;
  }

  /**
   * ポイントを消費する。
   *
   * @param point 消費ポイント
   * @return 消費後の残余ポイント
   */
  GiftPoint consume(final ConsumptionPoint point) {
    if (!isEnough(point)) {
      throw new IllegalArgumentException("ポイントが不足しています。");
    }

    return new GiftPoint(value - point.value);
  }
}
