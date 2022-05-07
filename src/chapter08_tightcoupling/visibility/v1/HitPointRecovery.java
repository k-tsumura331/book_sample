package chapter08_tightcoupling.visibility.v1;

public class HitPointRecovery {
  /**
   * @param chanter          回復魔法の詠唱者
   * @param targetMemberId   回復魔法を受けるメンバーのID
   * @param positiveFeelings メンバーどうしの好感度
   */
  public HitPointRecovery(final Member chanter, final int targetMemberId, final PositiveFeelings positiveFeelings) {
    final int basicRecoverAmount = (int)(chanter.magicPower * MAGIC_POWER_COEFFICIENT) + (int)(chanter.affection * AFFECTION_COEFFICIENT * positiveFeelings.value(chanter.id, targetMemberId));
    // 省略
  }

  final float MAGIC_POWER_COEFFICIENT = 0.1f;
  final float AFFECTION_COEFFICIENT = 0.1f;
}