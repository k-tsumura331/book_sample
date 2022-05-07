package chapter07_collection.earlybreak.v1;

import chapter07_collection.earlybreak.Member;

import java.util.List;

class Logic {
  List<Member> members;

  void method() {
    int totalDamage = 0;
    for (Member member : members) {
      if (member.hasTeamAttackSucceeded()) {
        int damage = (int)(member.attack() * 1.1);
        if (30 <= damage) {
          totalDamage += damage;
        }
        else {
          break;
        }
      }
      else {
        break;
      }
    }
  }
}
