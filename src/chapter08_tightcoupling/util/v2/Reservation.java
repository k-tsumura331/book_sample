package chapter08_tightcoupling.util.v2;

class Reservation {
  private final int reservationId;  // 商品の予約ID
  Reservation() {
    reservationId = 0;
  }
  // 中略
  void cancel() {
    // reservationIdを使った予約キャンセル処理
  }
}
