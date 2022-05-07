package chapter12_method.returnvalue.v2;

public class MoneysLogic {
  Price productPrice;
  Price otherPrice;

  void method() {
    Price price = productPrice.add(otherPrice);
    DiscountedPrice discountedPrice = new DiscountedPrice(price);
    DeliveryPrice deliveryPrice = new  DeliveryPrice(discountedPrice);
  }
}
