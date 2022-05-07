package chapter11_comment;

import java.util.Currency;

class Money {
  final int amount;
  final Currency currency;

  Money(final int amount, final Currency currency) {
    if (amount < 0) {
      throw new IllegalArgumentException("金額が0以上でありません。");
    }
    if (currency == null) {
      throw new NullPointerException("通貨を指定してください。");
    }

    this.amount = amount;
    this.currency = currency;
  }

  /**
   * 金額を加算する
   *
   * @param other 加算する金額
   * @return 加算後の金額
   * @throws IllegalArgumentException 通貨単位が異なる場合スロー
   */
  Money add(final Money other) {
    if (!currency.equals(other.currency)) {
      throw new IllegalArgumentException("通貨単位が違います。");
    }

    final int added = amount + other.amount;
    return new Money(added, currency);
  }
}
