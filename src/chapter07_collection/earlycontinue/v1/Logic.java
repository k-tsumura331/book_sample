package chapter07_collection.earlycontinue.v1;

import chapter07_collection.earlycontinue.Member;
import chapter07_collection.earlycontinue.StateType;

import java.util.List;

public class Logic {
  List<Member> members;
  void method() {
    for (Member member : members) {
      if (0 < member.hitPoint) {
        if (member.containsState(StateType.poison)) {
          member.hitPoint -= 10;
          if (member.hitPoint <= 0) {
            member.hitPoint = 0;
            member.addState(StateType.dead);
            member.removeState(StateType.poison);
          }
        }
      }
    }
  }
}
