package chapter08_tightcoupling.visibility.v1;

/** 戦闘画面 */
public class BattleView {
  PositiveFeelings positiveFeelings;
  Member member1;
  Member member2;
  // 中略

  /** 攻撃アニメーションを開始する */
  public void startAttackAnimation() {
    // 中略
    positiveFeelings.increase(member1.id, member2.id);
  }
}
