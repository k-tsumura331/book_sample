package chapter07_collection.prison.v1;

import chapter07_collection.prison.Item;

import java.util.List;

public class PrisonLogic {
  List<Item> items;

  void method() {
    boolean hasPrisonKey = false;
    // itemsはList<Item>型
    for (Item each : items) {
      if (each.name.equals("牢屋の鍵")) {
        hasPrisonKey = true;
        break;
      }
    }
  }
}
