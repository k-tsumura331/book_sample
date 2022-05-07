package chapter02_designfirststep.hitpoint.v1;

public class HitPointLogic {
  int hitPoint;
  int damageAmount;
  int recoveryAmount;

  void recover() {
    hitPoint = hitPoint - damageAmount;
    if (hitPoint < 0) {
      hitPoint = 0;
    }
  }

  void damage() {
    hitPoint = hitPoint + recoveryAmount;
    if (999 < hitPoint) {
      hitPoint = 999;
    }
  }
}
