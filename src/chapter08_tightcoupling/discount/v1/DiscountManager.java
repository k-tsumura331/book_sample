package chapter08_tightcoupling.discount.v1;

import java.util.List;

class DiscountManager {
  List<Product> discountProducts;
  int totalPrice;

  /**
   * 商品を追加する
   *
   * @param product         商品
   * @param productDiscount 商品割引情報
   * @return 追加に成功した場合true
   */
  boolean add(Product product, ProductDiscount productDiscount) {
    if (product.id < 0) {
      throw new IllegalArgumentException();
    }
    if (product.name.isEmpty()) {
      throw new IllegalArgumentException();
    }
    if (product.price < 0) {
      throw new IllegalArgumentException();
    }
    if (product.id != productDiscount.id) {
      throw new IllegalArgumentException();
    }

    int discountPrice = getDiscountPrice(product.price);

    int tmp;
    if (productDiscount.canDiscount) {
      tmp = totalPrice + discountPrice;
    } else {
      tmp = totalPrice + product.price;
    }
    if (tmp <= 20000) {
      totalPrice = tmp;
      discountProducts.add(product);
      return true;
    } else {
      return false;
    }
  }

  /**
   * 割引価格を取得する
   *
   * @param price 商品価格
   * @return 割引価格
   */
  static int getDiscountPrice(int price) {
    int discountPrice = price - 300;
    if (discountPrice < 0) {
      discountPrice = 0;
    }
    return discountPrice;
  }
}
