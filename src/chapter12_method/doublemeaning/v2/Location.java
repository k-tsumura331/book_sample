package chapter12_method.doublemeaning.v2;

class Location {
  int x;
  int y;

  boolean valid(int x, int y) {
    return true;
  }
  //省略

  Location(final int x, final int y) {
    if (!valid(x, y)) {
      throw new IllegalArgumentException("不正な位置です");
    }

    this.x = x;
    this.y = y;
  }

  // 位置を移動する
  Location shift(final int shiftX, final int shiftY) {
    int nextX = x + shiftX;
    int nextY = y + shiftY;

    return new Location(nextX, nextY);
  }
}
