package chapter10_namedesign.booleanmethod.v1;

import chapter10_namedesign.booleanmethod.StateType;
import chapter10_namedesign.booleanmethod.States;

class Member {
  final States states;

  Member() {
    states = new States();
  }
}
