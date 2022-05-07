package chapter06_conditionbranch.switchcase.magic.v4;


import chapter06_conditionbranch.switchcase.magic.Member;

// 魔法「紫電」
class Shiden implements Magic {
  private final Member member;

  Shiden(final Member member) {
    this.member = member;
  }

  public String name() {
    return "紫電";
  }

  public int costMagicPoint() {
    return 5 + (int)(member.level * 0.2);
  }

  public int attackPower() {
    return 50 + (int)(member.agility * 1.5);
  }

  public int costTechnicalPoint() {
    return 5;
  }
}
