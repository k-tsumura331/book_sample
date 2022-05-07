package chapter09_unhealthycode.nullproblem.v1;

class Member {
  private Equipment head;
  private Equipment body;
  private Equipment arm;
  private int defence;

  // 中略

  // 防具の防御力を加味した総合防御力を返す
  int totalDefence() {
    int total = defence;

    if (head != null) {
      total += head.defence;
    }
    if (body != null) {
      total += body.defence;
    }
    if (arm != null) {
      total += arm.defence;
    }

    return total;
  }

  // 全ての防具を外す
  void takeOffAllEquipments() {
    head = null;
    body = null;
    arm = null;
  }
}
