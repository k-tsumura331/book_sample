package chapter10_namedesign.maxhitpoint;

class OriginalMaxHitPoint {
  private static final int MIN = 10;
  private static final int MAX = 999;
  final int value;

  OriginalMaxHitPoint(final int value) {
    if (value < MIN || MAX < value) {
      throw new IllegalArgumentException();
    }
    this.value = value;
  }
}
