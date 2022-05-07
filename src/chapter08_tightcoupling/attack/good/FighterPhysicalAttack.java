package chapter08_tightcoupling.attack.good;

class FighterPhysicalAttack {
  private final PhysicalAttack physicalAttack;

  FighterPhysicalAttack() {
    physicalAttack = new PhysicalAttack();
  }
  // 省略

  int singleAttackDamage() {
    return physicalAttack.singleAttackDamage() + 20;
  }

  int doubleAttackDamage() {
    return physicalAttack.doubleAttackDamage() + 10;
  }
}
