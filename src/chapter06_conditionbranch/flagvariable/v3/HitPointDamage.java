package chapter06_conditionbranch.flagvariable.v3;

import chapter06_conditionbranch.flagvariable.Member;
import chapter06_conditionbranch.flagvariable.StateType;

class HitPointDamage implements Damage {
  Member member;
  // 中略
  public void execute(final int damageAmount) {
    member.hitPoint -= damageAmount;
    if (0 < member.hitPoint) return;

    member.hitPoint = 0;
    member.addState(StateType.dead);
  }
}
