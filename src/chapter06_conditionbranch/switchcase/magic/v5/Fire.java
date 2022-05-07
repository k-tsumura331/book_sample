package chapter06_conditionbranch.switchcase.magic.v5;

import chapter06_conditionbranch.switchcase.magic.Member;

class Fire implements Magic {
  private final Member member;

  Fire(final Member member) {
    this.member = member;
  }

  public String name() {
    return "ファイア";
  }

  public MagicPoint costMagicPoint() {
    return new MagicPoint(2);
  }

  public AttackPower attackPower() {
    final int value = 20 + (int)(member.level * 0.5);
    return new AttackPower(value);
  }

  public TechnicalPoint costTechnicalPoint() {
    return new TechnicalPoint(0);
  }
}
