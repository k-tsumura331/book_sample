package chapter06_conditionbranch.policy.v2;

import chapter06_conditionbranch.policy.PurchaseHistory;

class ReturnRateRule implements ExcellentCustomerRule {
  public boolean ok(final PurchaseHistory history) {
    return history.returnRate <= 0.001;
  }
}
