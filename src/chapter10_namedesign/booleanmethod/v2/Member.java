package chapter10_namedesign.booleanmethod.v2;

import chapter10_namedesign.booleanmethod.StateType;
import chapter10_namedesign.booleanmethod.States;

class Member {
  private final States states;

  Member() {
    states = new States();
  }

  boolean isInConfusion() {
    return states.contains(StateType.confused);
  }
}
