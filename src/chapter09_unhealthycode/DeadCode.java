package chapter09_unhealthycode;

public class DeadCode {
  int level;
  void method() {
    if (level > 99) {
      level = 99;
    }

// 中略

    if (level == 1) {
      // メンバーのHPや装備などを初期化する
      initHitPoint();
      initMagicPoint();
      initEquipments();
    }
    else if (level == 100) {
      // レベル100のボーナスとして、
      // 固有の特別能力を付与する。
      addSpecialAbility();
    }
  }

  private void initEquipments() {
  }

  private void initMagicPoint() {
  }

  private void initHitPoint() {
  }

  private void addSpecialAbility() {
  }
}
