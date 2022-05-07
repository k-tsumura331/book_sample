package chapter09_unhealthycode.comic;

/** コミックの購読ポイント */
class ReadingPoint {
  /** ポイントの最小値 */
  private static final int MIN = 0;

  /** お試し購読の消費ポイント */
  private static final int TRIAL_READING_POINT = 60;

  /** 購読ポイント値 */
  final int value;

  /*
   * コミックの購読ポイントReadingPointのコンストラクタ。
   * @param value 購読ポイント
   */
  ReadingPoint(final int value) {
    if (value < MIN) {
      throw new IllegalArgumentException();
    }

    this.value = value;
  }

  /*
   * お試し購読可能かどうかを返す。
   * @return お試し購読可能の場合true
   */
  boolean canTryRead() {
    return TRIAL_READING_POINT <= value;
  }

  /*
   * お試し購読する。
   * @return お試し購読後のポイント
   */
  ReadingPoint consumeTrial() {
    return new ReadingPoint(value - TRIAL_READING_POINT);
  }

  /*
   * 購読ポイントを追加する。
   * @param point 追加ポイント
   * @return 追加後のポイント
   */
  ReadingPoint add(final ReadingPoint point) {
    return new ReadingPoint(value + point.value);
  }
}
