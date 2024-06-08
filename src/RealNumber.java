public class RealNumber extends NumberType {
  public RealNumber(String number) {
    super(number, REAL_RADIX);
  }

  @Override
  public NumberType sum(NumberType number) {
    this.createArithmeticException(!this.canBeCalculated(this.getRadix(), number.getRadix()));
    int firstNumber = this.parseNumber(this.getNumber(), this.getRadix());
    int secondNumber = this.parseNumber(number.getNumber(), number.getRadix());
    return new RealNumber(Integer.toString(firstNumber + secondNumber));
  }

  @Override
  public NumberType subtract(NumberType number) {
    this.createArithmeticException(!this.canBeCalculated(this.getRadix(), number.getRadix()));
    int firstNumber = this.parseNumber(this.getNumber(), this.getRadix());
    int secondNumber = this.parseNumber(number.getNumber(), number.getRadix());
    return new RealNumber(Integer.toString(firstNumber - secondNumber));
  }

  @Override
  public NumberType multiply(NumberType number) {
    this.createArithmeticException(!this.canBeCalculated(this.getRadix(), number.getRadix()));
    int firstNumber = this.parseNumber(this.getNumber(), this.getRadix());
    int secondNumber = this.parseNumber(number.getNumber(), number.getRadix());
    return new RealNumber(Integer.toString(firstNumber * secondNumber));
  }

  @Override
  public NumberType divide(NumberType number) {
    this.createArithmeticException(!this.canBeCalculated(this.getRadix(), number.getRadix()));
    int firstNumber = this.parseNumber(this.getNumber(), this.getRadix());
    int secondNumber = this.parseNumber(number.getNumber(), number.getRadix());
    if (secondNumber == 0) {
      throw new ArithmeticException("Divide by zero");
    }
    return new RealNumber(Integer.toString(firstNumber / secondNumber));
  }
}
