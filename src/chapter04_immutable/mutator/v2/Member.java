package chapter04_immutable.mutator.v2;

import chapter04_immutable.mutator.StateType;
import chapter04_immutable.mutator.States;

class Member {
  final HitPoint hitPoint;
  final States states;

  Member() {
    hitPoint = new HitPoint(100);
    states = new States();
  }

  /**
   * ダメージを受ける
   * @param damageAmount ダメージ量
   */
  void damage(final int damageAmount) {
    hitPoint.damage(damageAmount);
    if (hitPoint.isZero()) {
      states.add(StateType.dead);
    }
  }
}
