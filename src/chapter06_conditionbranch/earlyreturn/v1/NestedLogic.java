package chapter06_conditionbranch.earlyreturn.v1;

import chapter06_conditionbranch.earlyreturn.Magic;
import chapter06_conditionbranch.earlyreturn.Member;

public class NestedLogic {
  Member member;
  Magic magic;

  void method() {
// 生存しているか判定
    if (0 < member.hitPoint) {
      // 行動可能かを判定
      if (member.canAct()) {
        // 魔法力が残存しているかを判定
        if (magic.costMagicPoint <= member.magicPoint) {
          member.consumeMagicPoint(magic.costMagicPoint);
          member.chant(magic);
        }
      }
    }
  }
}
