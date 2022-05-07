package chapter04_immutable.sideeffect.v2;

class ProcessLogic {
  void methodV1() {
    AttackPower attackPower = new AttackPower(20);
    // 中略
    attackPower.reinForce(15);
    System.out.println("attack power : " + attackPower.value);
  }

  void methodV2(AttackPower attackPower) {
    // 別のスレッド処理
    attackPower.disable();
  }
}
