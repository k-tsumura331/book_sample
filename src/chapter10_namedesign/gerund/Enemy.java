package chapter10_namedesign.gerund;

import java.util.List;

class Enemy {
  boolean isAppeared;
  int magicPoint;
  Item dropItem;

  // 逃げる。
  void escape() {
    isAppeared = false;
  }

  // 魔法力を消費する。
  void consumeMagicPoint(int costMagicPoint) {
    magicPoint -= costMagicPoint;
    if (magicPoint < 0) {
      magicPoint = 0;
    }
  }

  // 主人公らのパーティにアイテムを追加する。
  // 追加できた場合はtrueを返す。
  boolean addItemToParty(List<Item> items) {
    if (items.size() < 99) {
      items.add(dropItem);
      return true;
    }
    return false;
  }
}