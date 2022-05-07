/// <summary>ヒットポイント</summary>
class HitPoint {
  private const int MIN = 0;
  // readonlyはJavaのfinalに相当
  readonly int _value;
  private readonly MaxHitPoint _maxHitPoint;

  /// <summary>
  /// <param name="value">現在のヒットポイント</param>
  /// <param name="maxHitPoint">最大ヒットポイント</param>
  /// </summary>
  HitPoint(int value, MaxHitPoint maxHitPoint) {
    if (value < MIN) {
      throw new ArgumentOutOfRangeException("0以上を指定してください");
    }
    _value = value;
    _maxHitPoint = maxHitPoint;
  }

  /// <summary>
  /// 最大まで回復する
  /// <returns>ヒットポイント</returns>
  /// </summary>
  HitPoint RecoverCompletely() {
    return new HitPoint(_maxHitPoint._value, _maxHitPoint);
  }
}
