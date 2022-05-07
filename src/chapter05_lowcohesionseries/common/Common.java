package chapter05_lowcohesionseries.common;

import java.math.BigDecimal;

class Common {
  // 省略

  // 税込金額を計算する
  static BigDecimal calcAmountIncludingTax(BigDecimal amountExcludingTax, BigDecimal taxRate) {
    return amountExcludingTax.multiply(taxRate);
  }
}