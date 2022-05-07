package chapter05_lowcohesionseries.gift.v2;

class GiftPoint {
  private static final int MIN_POINT = 0;
  private static final int STANDARD_MEMBERSHIP_POINT = 3000;
  private static final int PREMIUM_MEMBERSHIP_POINT = 10000;
  final int value;

  // 外部からはnewできない。
  // クラス内部でのみnewできる。
  private GiftPoint(final int point) {
    if (point < MIN_POINT) {
      throw new IllegalArgumentException("ポイントが0以上ではありません。");
    }

    value = point;
  }

  /**
   * @return 標準会員向け入会ギフトポイント
   */
  static GiftPoint forStandardMembership() {
    return new GiftPoint(STANDARD_MEMBERSHIP_POINT);
  }

  /**
   * @return プレミアム会員向け入会ギフトポイント
   */
  static GiftPoint forPremiumMembership() {
    return new GiftPoint(PREMIUM_MEMBERSHIP_POINT);
  }
  // 省略
}
