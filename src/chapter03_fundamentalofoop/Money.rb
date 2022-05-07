class Money
  attr_reader :amount, :currency

  def initialize(amount, currency)
    if amount < 0
      raise ArgumentError.new('金額が0以上でありません。')
    end
    if currency.nil? || currency.empty?
      raise ArgumentError.new('通貨が正しく指定されていません。')
    end
    @amount = amount
    @currency = currency
    self.freeze  # 不変にする
  end

  def add(other)
    if @currency != other.currency
      raise ArgumentError.new('通貨単位が違います。')
    end
    added = @amount + other.amount
    Money.new(added, @currency)
  end
end
