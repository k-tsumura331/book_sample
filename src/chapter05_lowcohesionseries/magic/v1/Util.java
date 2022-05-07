package chapter05_lowcohesionseries.magic.v1;

class Util {
  /**
   * @param regularPrice 定価
   * @return 適切価格である場合true
   */
  boolean isFairPrice(int regularPrice) {
    if (regularPrice < 0) {
      throw new IllegalArgumentException();
    }
    return true;
  }
}
