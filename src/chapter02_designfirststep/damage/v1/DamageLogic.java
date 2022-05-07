package chapter02_designfirststep.damage.v1;

public class DamageLogic {
  int p1;
  int p2;
  int d1;
  int d2;

  int damageMethod() {
    int d = 0;
    d = p1 + p2;
    d = d - ((d1 + d2) / 2);
    if (d < 0) {
      d = 0;
    }
    return d;
  }
}
