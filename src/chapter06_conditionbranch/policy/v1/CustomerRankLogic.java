package chapter06_conditionbranch.policy.v1;

import chapter06_conditionbranch.policy.PurchaseHistory;

class CustomerRankLogic {
  /**
   * @return ゴールド会員である場合true
   * @param history 購入履歴
   */
  boolean isGoldCustomer(PurchaseHistory history) {
    if (100000 <= history.totalAmount) {
      if (10 <= history.purchaseFrequencyPerMonth) {
        if (history.returnRate <= 0.001) {
          return true;
        }
      }
    }
    return false;
  }

  /**
   * @return シルバー会員である場合true
   * @param history 購入履歴
   */
  boolean isSilverCustomer(PurchaseHistory history) {
    if (10 <= history.purchaseFrequencyPerMonth) {
      if (history.returnRate <= 0.001) {
        return true;
      }
    }
    return false;
  }
}
