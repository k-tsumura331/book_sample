package chapter09_unhealthycode.comic;

class ComicManager {
  int value;
  // 中略
  boolean isOk() {
    return 60 <= value;
  }

  void tryConsume() {
    int tmp = value - 60;
    if (tmp < 0) {
      throw new RuntimeException();
    }
    value = tmp;
  }
}
