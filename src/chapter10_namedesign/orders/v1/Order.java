package chapter10_namedesign.orders.v1;

import chapter10_namedesign.orders.GiftPoint;
import chapter10_namedesign.orders.Items;
import chapter10_namedesign.orders.OrderId;

class Order {
  private final OrderId id;
  private final Items items;
  private GiftPoint giftPoint;

  int itemCount() {
    int count = items.count();

    // 注文商品数が10個以上ならお買い物ギフトポイントを100追加する。
    if (10 <= count) {
      giftPoint = giftPoint.add(new GiftPoint(100));
    }

    return count;
  }

  Order() {
    id = new OrderId();
    items = new Items();
  }
}