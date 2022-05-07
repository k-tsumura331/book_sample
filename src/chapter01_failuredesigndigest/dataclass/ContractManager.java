package chapter01_failuredesigndigest.dataclass;

import java.math.BigDecimal;

public class ContractManager {
  public ContractAmount contractAmount;

  // 税込金額を計算する。
  public int calculateAmountIncludingTax(int amountExcludingTax, BigDecimal salesTaxRate) {
    BigDecimal multiplier = salesTaxRate.add(new BigDecimal("1.0"));
    BigDecimal amountIncludingTax = multiplier.multiply(new BigDecimal(amountExcludingTax));
    return amountIncludingTax.intValue();
  }

  // 契約締結する。
  public void conclude() {
    int amountExcludingTax = 1000;
    BigDecimal salesTaxRate = new BigDecimal("0.10");
    // 省略
    int amountIncludingTax = calculateAmountIncludingTax(amountExcludingTax, salesTaxRate);
    contractAmount = new ContractAmount();
    contractAmount.amountIncludingTax = amountIncludingTax;
    contractAmount.salesTaxRate = salesTaxRate;
    // 省略
  }
}
