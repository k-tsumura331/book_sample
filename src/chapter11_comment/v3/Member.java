package chapter11_comment.v3;

import chapter11_comment.StateType;
import chapter11_comment.States;

class Member {
  private final States states;

  Member() {
    states = new States();
  }

  boolean canAct() {
    // 行動不能の仕様が変更される場合、
    // 本ロジックの変更を検討すること。
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
