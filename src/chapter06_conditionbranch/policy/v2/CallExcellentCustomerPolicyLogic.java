package chapter06_conditionbranch.policy.v2;

import chapter06_conditionbranch.policy.PurchaseHistory;

public class CallExcellentCustomerPolicyLogic {
  PurchaseHistory purchaseHistory;
  void method() {
    ExcellentCustomerPolicy goldCustomerPolicy = new ExcellentCustomerPolicy();
    goldCustomerPolicy.add(new GoldCustomerPurchaseAmountRule());
    goldCustomerPolicy.add(new PurchaseFrequencyRule());
    goldCustomerPolicy.add(new ReturnRateRule());

    goldCustomerPolicy.complyWithAll(purchaseHistory);
  }
}
