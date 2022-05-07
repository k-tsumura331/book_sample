package chapter11_comment.v4;

import chapter11_comment.StateType;
import chapter11_comment.States;

class Member {
  private final States states;

  Member() {
    states = new States();
  }

  // 苦しい状態の場合trueを返す。
  boolean isPainful() {
    // 今後仕様変更で状態異常による表情変化が追加される場合、
    // 本メソッドへロジック追加すること。
    if (states.contains(StateType.poison) ||
            states.contains(StateType.paralyzed) ||
            states.contains(StateType.fear)) {
      return true;
    }

    return false;
  }
}
