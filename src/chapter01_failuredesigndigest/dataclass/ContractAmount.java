package chapter01_failuredesigndigest.dataclass;

import java.math.BigDecimal;

public class ContractAmount {
  public int amountIncludingTax;  // 税込金額
  public BigDecimal salesTaxRate; // 消費税率
}
