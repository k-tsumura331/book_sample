package chapter04_immutable.sideeffect.v2;

class AttackPower {
  static final int MIN = 0;
  int value;

  AttackPower(int value) {
    if (value < MIN) {
      throw new IllegalArgumentException();
    }

    this.value = value;
  }

  /**
   * 攻撃力を強化する
   * @param increment 攻撃力の増分
   */
  void reinForce(int increment) {
    value += increment;
  }

  /** 無力化する */
  void disable() {
    value = MIN;
  }
}
