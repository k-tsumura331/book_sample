package chapter14_refactoring.webcomic.v2;

import chapter14_refactoring.webcomic.*;

import java.time.LocalDateTime;

class PurchasePointPayment {
  final CustomerId customerId;
  final ComicId comicId;
  final PurchasePoint consumptionPoint;
  final LocalDateTime paymentDateTime;

  PurchasePointPayment(final Customer customer, final Comic comic) {
    if (!customer.isEnabled()) {
      throw new IllegalArgumentException("有効な購入者ではありません。");
    }
    customerId = customer.id;
    if (comic.isEnabled()) {
      comicId = comic.id;
      if (comic.currentPurchasePoint.amount <= customer.possessionPoint.amount) {
        consumptionPoint = comic.currentPurchasePoint;
        paymentDateTime = LocalDateTime.now();
      }
      else {
        throw new RuntimeException("所持ポイントが不足しています。");
      }
    }
    else {
      throw new IllegalArgumentException("現在取り扱いのできないコミックです。");
    }
  }
}
