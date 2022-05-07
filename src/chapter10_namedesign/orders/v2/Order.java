package chapter10_namedesign.orders.v2;

import chapter10_namedesign.orders.GiftPoint;
import chapter10_namedesign.orders.Items;
import chapter10_namedesign.orders.OrderId;

class Order {
  private final OrderId id;
  private final Items items;
  private GiftPoint giftPoint;

  int itemCount() {
    return items.count();
  }

  boolean shouldAddGiftPoint() {
    return 10 <= itemCount();
  }

  void tryAddGiftPoint() {
    if (shouldAddGiftPoint()) {
      giftPoint = giftPoint.add(new GiftPoint(100));
    }
  }

  Order() {
    id = new OrderId();
    items = new Items();
  }
}
