package chapter06_conditionbranch.policy.v2;

import chapter06_conditionbranch.policy.PurchaseHistory;

class GoldCustomerPolicy {
  private final ExcellentCustomerPolicy policy;

  GoldCustomerPolicy() {
    policy = new ExcellentCustomerPolicy();
    policy.add(new GoldCustomerPurchaseAmountRule());
    policy.add(new PurchaseFrequencyRule());
    policy.add(new ReturnRateRule());
  }

  /**
   * @param history 購入履歴
   * @return ルールを全て満たす場合true
   */
  boolean complyWithAll(final PurchaseHistory history) {
    return policy.complyWithAll(history);
  }
}
