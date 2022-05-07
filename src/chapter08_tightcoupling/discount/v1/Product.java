package chapter08_tightcoupling.discount.v1;

// 商品
class Product {
  int id;                 // 商品ID
  String name;            // 商品名
  int price;              // 価格
  boolean canDiscount;    // ←新規追加。夏季割引可能な場合true
}
