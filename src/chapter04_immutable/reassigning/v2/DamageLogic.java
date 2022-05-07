package chapter04_immutable.reassigning.v2;

import chapter04_immutable.reassigning.Enemy;
import chapter04_immutable.reassigning.Member;

class DamageLogic {
  Member member;
  Enemy enemy;

  int damage() {
    final int basicAttackPower = member.power() + member.weaponAttack();
    final int finalAttackPower = (int)(basicAttackPower * (1f + member.speed() / 100f));
    final int reduction = (int)(enemy.defence / 2);
    final int damage = Math.max(0, finalAttackPower - reduction);

    return damage;
  }
}
