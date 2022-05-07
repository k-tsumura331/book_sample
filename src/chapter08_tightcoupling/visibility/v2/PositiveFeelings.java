package chapter08_tightcoupling.visibility.v2;

// アクセス修飾子を省略すると
// 可視性がpackage privateになる。
// パッケージ内でのみアクセス可能。
class PositiveFeelings {
  int value(final int subjectId, final int targetId) { return 0; }

  void increase(final int subjectId, final int targetId) { }

  void decrease(final int subjectId, final int targetId) { }
}
