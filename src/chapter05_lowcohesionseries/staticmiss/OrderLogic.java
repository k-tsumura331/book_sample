package chapter05_lowcohesionseries.staticmiss;

public class OrderLogic {
  MoneyData moneyData1;
  MoneyData moneyData2;

  void method() {
    moneyData1.amount = OrderManager.add(moneyData1.amount, moneyData2.amount);
  }
}
