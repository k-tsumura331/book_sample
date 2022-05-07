package chapter06_conditionbranch.switchcase.magic.v5;

import chapter06_conditionbranch.switchcase.magic.Member;

class HellFire implements Magic {
  private final Member member;

  HellFire(final Member member) {
    this.member = member;
  }

  public String name() {
    return "地獄の業火";
  }

  public MagicPoint costMagicPoint() {
    return new MagicPoint(16);
  }

  public AttackPower attackPower() {
    final int value = 200 + (int)(member.magicAttack * 0.5 + member.vitality * 2);
    return new AttackPower(value);
  }

  public TechnicalPoint costTechnicalPoint() {
    final int value = 20 + (int)(member.level * 0.4);
    return new TechnicalPoint(value);
  }
}
