package chapter04_immutable.reassigning.v1;

import chapter04_immutable.reassigning.Enemy;
import chapter04_immutable.reassigning.Member;

class DamageLogic {
  Member member;
  Enemy enemy;

  int damage() {
    // メンバーの腕力と武器性能が基本攻撃力
    int tmp = member.power() + member.weaponAttack();
    // メンバーのスピードで攻撃力を補正
    tmp = (int)(tmp * (1f + member.speed() / 100f));
    // 攻撃力から敵の防御力を差し引いたのがダメージ
    tmp = tmp - (int)(enemy.defence / 2);
    // ダメージ値が負数にならないよう補正
    tmp = Math.max(0, tmp);

    return tmp;
  }
}
