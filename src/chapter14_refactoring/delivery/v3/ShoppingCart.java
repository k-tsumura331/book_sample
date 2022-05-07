package chapter14_refactoring.delivery.v3;

import java.util.ArrayList;
import java.util.List;

// 買い物かご
class ShoppingCart {
  final List<Product> products;

  ShoppingCart() {
    products = new ArrayList<Product>();
  }

  private ShoppingCart(List<Product> products) {
    this.products = products;
  }

  ShoppingCart add(final Product product) {
    final List<Product> adding = new ArrayList<>(products);
    adding.add(product);
    return new ShoppingCart(adding);
  }
}
