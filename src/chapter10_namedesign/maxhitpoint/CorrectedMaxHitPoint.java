package chapter10_namedesign.maxhitpoint;

class CorrectedMaxHitPoint {
  final int value;

  CorrectedMaxHitPoint(final OriginalMaxHitPoint originalMaxHitPoint, final Accessory accessory, final Armor armor) {
    value = originalMaxHitPoint.value + accessory.maxHitPointIncrements() + armor.maxHitPointIncrements();
  }
}
