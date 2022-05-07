package chapter07_collection.earlycontinue.v3;

import chapter07_collection.earlycontinue.Member;
import chapter07_collection.earlycontinue.StateType;

import java.util.List;

public class Logic {
  List<Member> members;
  void method() {
    for (Member member : members) {
      if (member.hitPoint == 0) continue;
      if (!member.containsState(StateType.poison)) continue;

      member.hitPoint -= 10;

      if (0 < member.hitPoint) continue;

      member.hitPoint = 0;
      member.addState(StateType.dead);
      member.removeState(StateType.poison);
    }
  }
}
