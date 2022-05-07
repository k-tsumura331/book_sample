package chapter05_lowcohesionseries.methodchain;

/** 装備中の防具一覧 */
class Equipments {
  private boolean canChange;
  private Equipment head;
  private Equipment armor;
  private Equipment arm;

  /**
   * 鎧を装備する
   *
   * @param newArmor 装備する鎧
   */
  void equipArmor(final Equipment newArmor) {
    if (canChange) {
      armor = newArmor;
    }
  }

  /**
   * 全装備を解除する
   */
  void deactivateAll() {
    head = Equipment.Empty;
    armor = Equipment.Empty;
    arm = Equipment.Empty;
  }
}
