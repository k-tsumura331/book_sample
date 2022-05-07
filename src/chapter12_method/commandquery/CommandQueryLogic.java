package chapter12_method.commandquery;

class CommandQueryLogic {
  int point;

  /**
   * ポイントを増やす(コマンド)
   */
  void gainPoint() {
    point += 10;
  }

  /**
   * ポイントを返す(クエリ)
   * @return ポイント
   */
  int getPoint() {
    return point;
  }
}
