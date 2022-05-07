package chapter12_method.returnvalue.v2;

class Price {
  final int amount;

  Price(final int amount) {
    this.amount = amount;
  }

  // 省略
  Price add(final Price other) {
    final int added = amount + other.amount;
    return new Price(added);
  }
}
