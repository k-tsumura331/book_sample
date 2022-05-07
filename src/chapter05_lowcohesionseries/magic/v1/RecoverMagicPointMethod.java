package chapter05_lowcohesionseries.magic.v1;

import java.util.List;

class RecoverMagicPointMethod {
  /**
   * 魔法力を回復する
   * @param currentMagicPoint 現在の魔法力残量
   * @param originalMaxMagicPoint オリジナルの魔法力最大値
   * @param maxMagicPointIncrements 魔法力最大値の増分
   * @return 回復後の魔法力残量
   */
  int recoverMagicPoint(int currentMagicPoint, int originalMaxMagicPoint, List<Integer> maxMagicPointIncrements, int recoveryAmount) {
    int currentMaxMagicPoint = originalMaxMagicPoint;
    for (int each : maxMagicPointIncrements) {
      currentMaxMagicPoint += each;
    }

    return Math.min(currentMagicPoint + recoveryAmount, currentMaxMagicPoint);
  }
}
