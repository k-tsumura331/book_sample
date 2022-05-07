package chapter11_comment.v2;

import chapter11_comment.StateType;
import chapter11_comment.States;

class Member {
  private final States states;

  Member() {
    states = new States();
  }

  boolean isNotSleepingAndIsNotParalyzedAndIsNotConfusedAndIsNotStoneAndIsNotDead() {
    if (states.contains(StateType.sleeping) ||
            states.contains(StateType.paralyzed) ||
            states.contains(StateType.confused) ||
            states.contains(StateType.stone) ||
            states.contains(StateType.dead)) {
      return false;
    }

    return true;
  }
}
