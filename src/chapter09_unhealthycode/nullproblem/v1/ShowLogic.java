package chapter09_unhealthycode.nullproblem.v1;

public class ShowLogic {
  Equipment body;
  // 体防具を表示する
  void showBodyEquipment() {
    if (body != null) {
      showParam(body.name);
      showParam(body.defence);
      showParam(body.magicDefence);
    }
  }

  void showParam(Object text) {}
}
