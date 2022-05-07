package chapter06_conditionbranch.switchcase.magic.v4;

import chapter06_conditionbranch.switchcase.magic.Member;

// 魔法「ファイア」
class Fire implements Magic {
  private final Member member;

  Fire(final Member member) {
    this.member = member;
  }

  public String name() {
    return "ファイア";
  }

  public int costMagicPoint() {
    return 2;
  }

  public int attackPower() {
    return 20 + (int)(member.level * 0.5);
  }

  public int costTechnicalPoint() {
    return 0;
  }
}
