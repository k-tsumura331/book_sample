package chapter08_tightcoupling.hugedata;

import java.time.ZonedDateTime;
import java.util.List;

class Order {
  int orderId;                        // 注文ID
  int customerId;                     // 発注者ID
  List<Product> products;             // 注文品一覧
  ZonedDateTime orderTime;            // 注文日時
  OrderState orderState;              // 注文状態
  int reservationId;                  // 予約ID
  ZonedDateTime reservationDateTime;  // 予約日時
  String deliveryDestination;         // 配送先
}
