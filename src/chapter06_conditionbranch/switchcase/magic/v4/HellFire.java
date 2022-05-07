package chapter06_conditionbranch.switchcase.magic.v4;

import chapter06_conditionbranch.switchcase.magic.Member;

// 魔法「地獄の業火」
class HellFire implements Magic {
  private final Member member;

  HellFire(final Member member) {
    this.member = member;
  }

  public String name() {
    return "地獄の業火";
  }

  public int costMagicPoint() {
    return 16;
  }

  public int attackPower() {
    return 200 + (int)(member.magicAttack * 0.5 + member.vitality * 2);
  }

  public int costTechnicalPoint() {
    return 20 + (int)(member.level * 0.4);
  }
}
