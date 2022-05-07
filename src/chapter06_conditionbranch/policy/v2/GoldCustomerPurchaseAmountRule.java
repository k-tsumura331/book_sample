package chapter06_conditionbranch.policy.v2;

import chapter06_conditionbranch.policy.PurchaseHistory;

class GoldCustomerPurchaseAmountRule implements ExcellentCustomerRule {
  public boolean ok(final PurchaseHistory history) {
    return 100000 <= history.totalAmount;
  }
}
