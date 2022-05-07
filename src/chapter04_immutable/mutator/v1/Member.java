package chapter04_immutable.mutator.v1;

import chapter04_immutable.mutator.States;

class Member {
  final HitPoint hitPoint;
  final States states;

  Member() {
    hitPoint = new HitPoint();
    states = new States();
  }

  /**
   * ダメージを受ける
   * @param damageAmount ダメージ量
   */
  void damage(int damageAmount) {
    hitPoint.amount -= damageAmount;
  }
}
