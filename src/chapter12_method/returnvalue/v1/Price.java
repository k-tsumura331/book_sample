package chapter12_method.returnvalue.v1;

class Price {
  int amount;
  // 省略
  int add(final Price other) {
    return amount + other.amount;
  }
}
