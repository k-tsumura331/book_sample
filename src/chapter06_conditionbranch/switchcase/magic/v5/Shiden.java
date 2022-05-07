package chapter06_conditionbranch.switchcase.magic.v5;

import chapter06_conditionbranch.switchcase.magic.Member;

class Shiden implements Magic {
  private final Member member;

  Shiden(final Member member) {
    this.member = member;
  }

  public String name() {
    return "紫電";
  }

  public MagicPoint costMagicPoint() {
    final int value = 5 + (int)(member.level * 0.2);
    return new MagicPoint(10);
  }

  public AttackPower attackPower() {
    final int value = 50 + (int)(member.agility * 1.5);
    return new AttackPower(value);
  }

  public TechnicalPoint costTechnicalPoint() {
    return new TechnicalPoint(5);
  }
}
