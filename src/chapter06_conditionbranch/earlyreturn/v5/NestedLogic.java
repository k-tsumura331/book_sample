package chapter06_conditionbranch.earlyreturn.v5;

import chapter06_conditionbranch.earlyreturn.Magic;
import chapter06_conditionbranch.earlyreturn.Member;

public class NestedLogic {
  Member member;
  Magic magic;

  void method() {
    if (member.hitPoint <= 0) return;
    if (!member.canAct()) return;
    if (member.magicPoint < magic.costMagicPoint) return;
    if (member.technicalPoint < magic.costTechnicalPoint) return;

    member.consumeMagicPoint(magic.costMagicPoint);
    member.chant(magic);
    member.gainTechnicalPoint(magic.incrementTechnicalPoint); // 新規追加
  }
}
