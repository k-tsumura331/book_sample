package chapter06_conditionbranch.flagvariable.v3;

import chapter06_conditionbranch.flagvariable.Member;

class MagicPointDamage implements Damage {
  Member member;
  // 中略
  public void execute(final int damageAmount) {
    member.magicPoint -= damageAmount;
    if (0 < member.magicPoint) return;

    member.magicPoint = 0;
  }
}
