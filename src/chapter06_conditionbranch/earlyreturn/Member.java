package chapter06_conditionbranch.earlyreturn;

public class Member {
  public int hitPoint;
  public int magicPoint;
  public int technicalPoint;

  public boolean canAct() {
    return true;
  }

  public void consumeMagicPoint(int costMp) {}
  public void chant(Magic magic) {}
  public void gainTechnicalPoint(int tp) {}
}
