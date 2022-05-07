package chapter05_lowcohesionseries.magic.v2;

import java.util.ArrayList;
import java.util.List;

/** 魔法力 */
class MagicPoint {
  private int currentAmount;
  private int originalMaxAmount;
  private final List<Integer> maxIncrements;

  // 省略
  MagicPoint() {
    originalMaxAmount = 100;
    maxIncrements = new ArrayList<>();
  }

  /** @return 現在の魔法力残量 */
  int current() {
    return currentAmount;
  }

  /** @return 魔法力の最大量 */
  int max() {
    int amount = originalMaxAmount;
    for (int each : maxIncrements) {
      amount += each;
    }
    return amount;
  }

  /**
   * 魔法力を回復する
   * @param recoveryAmount 回復量
   */
  void recover(final int recoveryAmount) {
    currentAmount = Math.min(currentAmount + recoveryAmount, max());
  }

  /**
   * 魔法力を消費する
   * @param consumeAmount 消費量
   */
  void consume(final int consumeAmount) {
    // 省略
  }
}
