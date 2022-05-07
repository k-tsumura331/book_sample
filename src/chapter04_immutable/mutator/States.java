package chapter04_immutable.mutator;

import java.util.HashSet;
import java.util.Set;

public class States {
  private final Set<StateType> stateSet;

  public States() {
    stateSet = new HashSet<>();
  }

  public void add(StateType stateType) {
    stateSet.add(stateType);
  }
}
