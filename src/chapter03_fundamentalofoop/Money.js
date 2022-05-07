function Money(amount, currency) {
  if (amount < 0) {
    throw new Error('金額が0以上でありません。');
  }
  if (!currency) {
    throw new Error('通貨が正しく指定されていません。');
  }
  this.amount = amount;
  this.currency = currency;
  Object.freeze(this);  // 不変にする
}

Money.prototype.add = function(other) {
  if (this.currency !== other.currency) {
    throw new Error('通貨単位が違います。');
  }
  const added = this.amount + other.amount;
  return new Money(added, this.currency);
}
