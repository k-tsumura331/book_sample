package chapter12_method.doublemeaning.v1;

class Location {
  int x;
  int y;

  boolean valid(int x, int y) {
    return true;
  }

  Location(int x, int y) {
    this.x = x;
    this.y = y;
  }
  //省略

  // 位置を移動する
  Location shift(final int shiftX, final int shiftY) {
    int nextX = x + shiftX;
    int nextY = y + shiftY;
    if (valid(nextX, nextY)) {
      return new Location(nextX, nextY);
    }
    // (-1, -1)はエラー値
    return new Location(-1, -1);
  }
}
