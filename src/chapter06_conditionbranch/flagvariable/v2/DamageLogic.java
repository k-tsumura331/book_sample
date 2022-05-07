package chapter06_conditionbranch.flagvariable.v2;

import chapter06_conditionbranch.flagvariable.Member;
import chapter06_conditionbranch.flagvariable.StateType;

public class DamageLogic {
  Member member;
  void hitPointDamage(final int damageAmount) {
    member.hitPoint -= damageAmount;
    if (0 < member.hitPoint) return;

    member.hitPoint = 0;
    member.addState(StateType.dead);
  }

  void magicPointDamage(final int damageAmount) {
    member.magicPoint -= damageAmount;
    if (0 < member.magicPoint) return;

    member.magicPoint = 0;
  }
}
