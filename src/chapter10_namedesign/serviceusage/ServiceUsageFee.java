package chapter10_namedesign.serviceusage;

/** サービス利用料 */
class ServiceUsageFee {
  final int amount;

  /**
   * @param amount 料金金額
   */
  private ServiceUsageFee(final int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("金額が0以上でありません。");
    }
    this.amount = amount;
  }

  /**
   * サービス利用料を確定する。
   *
   * @param salesPrice          販売価格
   * @param salesCommissionRate 販売手数料率
   * @return サービス利用料
   */
  static ServiceUsageFee determine(final SalesPrice salesPrice, final SalesCommissionRate salesCommissionRate) {
    int amount = (int)(salesPrice.amount * salesCommissionRate.value);
    return new ServiceUsageFee(amount);
  }
}
