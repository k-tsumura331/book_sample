package chapter08_tightcoupling.visibility.v1;

/**
 * メンバーどうしの好感度。
 * subjectがtargetに対して抱く好感度を取得したり、増減したりします。
 * subjectIdやtargetIdは、subjectとtargetの関係にあるメンバーのIDを表します。
 */
public class PositiveFeelings {
  /**
   * @param subjectId 好感度を調べたいメンバーID
   * @param targetId  好意の対象となるメンバーID
   * @return 好感度
   */
  public int value(int subjectId, int targetId) {
    // 省略
    return 0;
  }

  /**
   * 好感度を増加させる。
   *
   * @param subjectId 好感度を増加させたいメンバーID
   * @param targetId  好意の対象となるメンバーID
   */
  public void increase(int subjectId, int targetId) {
    // 省略
  }

  /**
   * 好感度を減少させる。
   *
   * @param subjectId 好感度を減少させたいメンバーID
   * @param targetId  好意の対象となるメンバーID
   */
  public void decrease(int subjectId, int targetId) {
    // 省略
  }
}