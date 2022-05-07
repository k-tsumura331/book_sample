package chapter02_designfirststep.damage.v2;

public class DamageLogic {
  int playerArmPower;
  int playerWeaponPower;
  int enemyBodyDefence;
  int enemyArmorDefence;

  int damageMethod() {
    int damageAmount = 0;
    damageAmount = playerArmPower + playerWeaponPower;  // …①
    damageAmount = damageAmount - ((enemyBodyDefence + enemyArmorDefence) / 2); // …②
    if (damageAmount < 0) {
      damageAmount = 0;
    }
    return damageAmount;
  }
}
