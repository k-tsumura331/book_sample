package chapter04_immutable.sideeffect.v1;

class ProcessLogic {
  void methodV1() {
    AttackPower attackPower = new AttackPower(20);

    Weapon weaponA = new Weapon(attackPower);
    Weapon weaponB = new Weapon(attackPower);
  }

  void methodV2() {
    AttackPower attackPower = new AttackPower(20);

    Weapon weaponA = new Weapon(attackPower);
    Weapon weaponB = new Weapon(attackPower);

    weaponA.attackPower.value = 25;

    System.out.println("Weapon A attack power : " + weaponA.attackPower.value);
    System.out.println("Weapon B attack power : " + weaponB.attackPower.value);
  }

  void methodV3() {
    AttackPower attackPowerA = new AttackPower(20);
    AttackPower attackPowerB = new AttackPower(20);

    Weapon weaponA = new Weapon(attackPowerA);
    Weapon weaponB = new Weapon(attackPowerB);

    weaponA.attackPower.value += 5;

    System.out.println("Weapon A attack power : " + weaponA.attackPower.value);
    System.out.println("Weapon B attack power : " + weaponB.attackPower.value);
  }
}
