package chapter07_collection.earlybreak.v2;

import chapter07_collection.earlybreak.Member;

import java.util.List;

class Logic {
  List<Member> members;

  void method() {
    int totalDamage = 0;
    for (Member member : members) {
      if (!member.hasTeamAttackSucceeded()) break;

      int damage = (int)(member.attack() * 1.1);

      if (damage < 30) break;

      totalDamage += damage;
    }
  }
}
