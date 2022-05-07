package chapter08_tightcoupling.order;

import java.util.ArrayList;
import java.util.List;

class OrderService {
  // 中略
  private int calcDiscountPrice(int price) {
    // 割引価格を計算するロジック
    return 0;
  }

  private List<Product> getProductBrowsingHistory(int userId) {
    // 商品の閲覧履歴を取得するロジック
    return new ArrayList<>();
  }
}
