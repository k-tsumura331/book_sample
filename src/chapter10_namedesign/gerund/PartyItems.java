package chapter10_namedesign.gerund;

import java.util.ArrayList;
import java.util.List;

class PartyItems {
  static final int MAX_ITEM_COUNT = 99;
  final List<Item> items;

  PartyItems() {
    items = new ArrayList<>();
  }

  private PartyItems(List<Item> items) {
    this.items = items;
  }

  PartyItems add(final Item newItem) {
    if (items.size() == MAX_ITEM_COUNT) {
      throw new RuntimeException("これ以上アイテムを持てません。");
    }

    final List<Item> adding = new ArrayList<>(items);
    adding.add(newItem);
    return new PartyItems(adding);
  }
}
