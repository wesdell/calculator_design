public class HexaDecimalNumber extends NumberType {
  public HexaDecimalNumber(String number) {
    super(number, HEXADECIMAL_RADIX);
  }

  @Override
  public NumberType sum(NumberType number) {
    this.createArithmeticException(!this.canBeCalculated(this.getRadix(), number.getRadix()));
    int firstNumber = this.parseNumber(this.getNumber(), this.getRadix());
    int secondNumber = this.parseNumber(number.getNumber(), number.getRadix());
    return new HexaDecimalNumber(Integer.toHexString(firstNumber + secondNumber));
  }

  @Override
  public NumberType subtract(NumberType number) {
    this.createArithmeticException(!this.canBeCalculated(this.getRadix(), number.getRadix()));
    int firstNumber = this.parseNumber(this.getNumber(), this.getRadix());
    int secondNumber = this.parseNumber(number.getNumber(), number.getRadix());
    return new HexaDecimalNumber(Integer.toHexString(firstNumber - secondNumber));
  }

  @Override
  public NumberType multiply(NumberType number) {
    this.createArithmeticException(!this.canBeCalculated(this.getRadix(), number.getRadix()));
    int firstNumber = this.parseNumber(this.getNumber(), this.getRadix());
    int secondNumber = this.parseNumber(number.getNumber(), number.getRadix());
    return new HexaDecimalNumber(Integer.toHexString(firstNumber * secondNumber));
  }

  @Override
  public NumberType divide(NumberType number) {
    this.createArithmeticException(!this.canBeCalculated(this.getRadix(), number.getRadix()));
    int firstNumber = this.parseNumber(this.getNumber(), this.getRadix());
    int secondNumber = this.parseNumber(number.getNumber(), number.getRadix());
    return new HexaDecimalNumber(Integer.toHexString(firstNumber / secondNumber));
  }
}
