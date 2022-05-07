package chapter06_conditionbranch.earlyreturn.v2;

import chapter06_conditionbranch.earlyreturn.Magic;
import chapter06_conditionbranch.earlyreturn.Member;

public class NestedLogic {
  Member member;
  Magic magic;

  void method() {
// 生存していない場合returnで処理を終了する。
// 早期returnへの変更には、条件を反転させる。
    if (member.hitPoint <= 0) return;

    if (member.canAct()) {
      if (magic.costMagicPoint <= member.magicPoint) {
        member.consumeMagicPoint(magic.costMagicPoint);
        member.chant(magic);
      }
    }
  }
}
