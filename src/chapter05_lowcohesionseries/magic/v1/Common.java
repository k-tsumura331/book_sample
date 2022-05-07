package chapter05_lowcohesionseries.magic.v1;

class Common {
  /**
   * @param regularPrice 定価
   * @param discountRate 割引率
   * @return 割引価格
   */
  int discountedPrice(int regularPrice, float discountRate) {
    if (regularPrice < 0) {
      throw new IllegalArgumentException();
    }
    if (discountRate < 0.0f) {
      throw new IllegalArgumentException();
    }
    return 0;
  }
}
