package chapter05_lowcohesionseries.crosscutting;

public class LoggerLogic {
  ShoppingCart shoppingCart;
  int product;

  void method() {
    try {
      shoppingCart.add(product);
    }
    catch (IllegalArgumentException e) {
      // reportはログ出力用のstaticメソッド
      Logger.report("問題が発生しました。買い物かごに商品を追加できません");
    }
  }
}
