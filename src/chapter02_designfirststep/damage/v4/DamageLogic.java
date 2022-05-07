package chapter02_designfirststep.damage.v4;

public class DamageLogic {
  // プレイヤーの攻撃力を合算する
  int sumUpPlayerAttackPower(int playerArmPower, int playerWeaponPower) {
    return playerArmPower + playerWeaponPower;
  }

  // 敵の防御力を合算する
  int sumUpEnemyDefence(int enemyBodyDefence, int enemyArmorDefence) {
    return enemyBodyDefence + enemyArmorDefence;
  }

  // ダメージ量を評価する
  int estimateDamage(int totalPlayerAttackPower, int totalEnemyDefence) {
    int damageAmount = totalPlayerAttackPower - (totalEnemyDefence / 2);
    if (damageAmount < 0) {
      return 0;
    }
    return damageAmount;
  }

  int playerBodyPower;
  int playerWeaponPower;
  int enemyBodyDefence;
  int enemyArmorDefence;

  int damageMethod() {
    int totalPlayerAttackPower = sumUpPlayerAttackPower(playerBodyPower, playerWeaponPower);
    int totalEnemyDefence = sumUpEnemyDefence(enemyBodyDefence, enemyArmorDefence);
    int damageAmount = estimateDamage(totalPlayerAttackPower, totalEnemyDefence);
    return damageAmount;
  }
}
