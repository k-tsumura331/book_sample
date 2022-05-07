package chapter04_immutable.sideeffect.v1;

class AttackPower {
  static final int MIN = 0;
  int value;  // finalが付いてないので可変

  AttackPower(int value) {
    if (value < MIN) {
      throw new IllegalArgumentException();
    }

    this.value = value;
  }
}
