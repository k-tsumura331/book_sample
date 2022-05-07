package chapter08_tightcoupling.attack.bad;

class FighterPhysicalAttack extends PhysicalAttack {
  @Override
  int singleAttackDamage() {
    return super.singleAttackDamage() + 20;
  }

  @Override
  int doubleAttackDamage() {
    return super.doubleAttackDamage() + 10;
  }
}
