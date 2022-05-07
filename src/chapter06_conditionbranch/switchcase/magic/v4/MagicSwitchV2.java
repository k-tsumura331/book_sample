package chapter06_conditionbranch.switchcase.magic.v4;

import chapter06_conditionbranch.switchcase.magic.MagicType;

import java.util.HashMap;
import java.util.Map;

public class MagicSwitchV2 {
  Map<MagicType, Magic> magics = new HashMap<>();
// 中略

  // 魔法攻撃を実行する
  void magicAttack(final MagicType magicType) {
    final Magic usingMagic = magics.get(magicType);

    showMagicName(usingMagic);
    consumeMagicPoint(usingMagic);
    consumeTechnicalPoint(usingMagic);
    magicDamage(usingMagic);
  }

  // 魔法の名前を画面表示する
  void showMagicName(final Magic magic) {
    final String name = magic.name();
    // nameを使った表示処理
  }

  // 魔法力を消費する
  void consumeMagicPoint(final Magic magic) {
    final int costMagicPoint = magic.costMagicPoint();
    // costMagicPointを使った魔法力消費処理
  }

  // テクニカルポイントを消費する
  void consumeTechnicalPoint(final Magic magic) {
    final int costTechnicalPoint = magic.costTechnicalPoint();
    // costTechnicalPointを使ったテクニカルポイント消費処理
  }

  // ダメージ計算する
  void magicDamage(final Magic magic) {
    final int attackPower = magic.attackPower();
    // attackPowerを使ったダメージ計算
  }
}
