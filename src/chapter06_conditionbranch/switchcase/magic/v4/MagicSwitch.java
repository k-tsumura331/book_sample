package chapter06_conditionbranch.switchcase.magic.v4;

import chapter06_conditionbranch.switchcase.magic.MagicType;
import chapter06_conditionbranch.switchcase.magic.Member;

import java.util.HashMap;
import java.util.Map;

public class MagicSwitch {
  private Member member;
  Map<MagicType, Magic> magics = new HashMap<>();

  void method() {
// 中略
    final Fire fire = new Fire(member);
    final Shiden shiden = new Shiden(member);
    final HellFire hellFire = new HellFire(member);

    magics.put(MagicType.fire, fire);
    magics.put(MagicType.shiden, shiden);
    magics.put(MagicType.hellFire, hellFire);
  }

  void magicAttack(final MagicType magicType) {
    final Magic usingMagic = magics.get(magicType);
    usingMagic.attackPower();
    // 省略
  }
}
