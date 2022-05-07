package chapter12_method.returnvalue.v1;

public class MoneysLogic {
  Price productPrice;
  Price otherPrice;

  int calcDiscountedPrice(int value) {
    return 0;
  }

  int calcDeliveryPrice(int value) {
    return 0;
  }

  void method() {
    int price = productPrice.add(otherPrice);                // 商品価格の総額
    int discountedPrice = calcDiscountedPrice(price);        // 割引金額
    int deliveryPrice = calcDeliveryPrice(discountedPrice);  // 配送料
  }
}
