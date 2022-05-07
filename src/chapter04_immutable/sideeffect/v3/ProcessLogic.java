package chapter04_immutable.sideeffect.v3;

class ProcessLogic {
  void methodV1() {
    final AttackPower attackPower = new AttackPower(20);
    // 中略
    final AttackPower reinForced = attackPower.reinForce(new AttackPower(15));
    System.out.println("attack power : " + reinForced.value);
  }

  void methodV2(AttackPower attackPower) {
    // 別のスレッド処理
    final AttackPower disabled = attackPower.disable();
  }

  void methodV3() {
    final AttackPower attackPowerA = new AttackPower(20);
    final AttackPower attackPowerB = new AttackPower(20);

    final Weapon weaponA = new Weapon(attackPowerA);
    final Weapon weaponB = new Weapon(attackPowerB);

    final AttackPower increment = new AttackPower(5);
    final Weapon reinForcedWeaponA = weaponA.reinForce(increment);

    System.out.println("Weapon A attack power : " + weaponA.attackPower.value);
    System.out.println("Reinforced weapon A attack power : " + reinForcedWeaponA.attackPower.value);
    System.out.println("Weapon B attack power : " + weaponB.attackPower.value);
  }
}
