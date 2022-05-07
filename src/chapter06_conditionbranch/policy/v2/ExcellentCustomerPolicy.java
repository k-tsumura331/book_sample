package chapter06_conditionbranch.policy.v2;

import chapter06_conditionbranch.policy.PurchaseHistory;

import java.util.HashSet;
import java.util.Set;

class ExcellentCustomerPolicy {
  private final Set<ExcellentCustomerRule> rules;

  ExcellentCustomerPolicy() {
    rules = new HashSet();
  }

  /**
   * ルールを追加する。
   *
   * @param rule ルール
   */
  void add(final ExcellentCustomerRule rule) {
    rules.add(rule);
  }

  /**
   * @param history 購入履歴
   * @return ルールを全て満たす場合true
   */
  boolean complyWithAll(final PurchaseHistory history) {
    for (ExcellentCustomerRule each : rules) {
      if (!each.ok(history)) return false;
    }
    return true;
  }
}
