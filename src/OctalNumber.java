public class OctalNumber extends NumberType {
  public OctalNumber(String number) {
    super(number, OCTAL_RADIX);
  }

  @Override
  public NumberType sum(NumberType number) {
    this.createArithmeticException(!this.canBeCalculated(this.getRadix(), number.getRadix()));
    int firstNumber = this.parseNumber(this.getNumber(), this.getRadix());
    int secondNumber = this.parseNumber(number.getNumber(), number.getRadix());
    return new OctalNumber(Integer.toOctalString(firstNumber + secondNumber));
  }

  @Override
  public NumberType subtract(NumberType number) {
    this.createArithmeticException(!this.canBeCalculated(this.getRadix(), number.getRadix()));
    int firstNumber = this.parseNumber(this.getNumber(), this.getRadix());
    int secondNumber = this.parseNumber(number.getNumber(), number.getRadix());
    return new OctalNumber(Integer.toOctalString(firstNumber - secondNumber));
  }

  @Override
  public NumberType multiply(NumberType number) {
    this.createArithmeticException(!this.canBeCalculated(this.getRadix(), number.getRadix()));
    int firstNumber = this.parseNumber(this.getNumber(), this.getRadix());
    int secondNumber = this.parseNumber(number.getNumber(), number.getRadix());
    return new OctalNumber(Integer.toOctalString(firstNumber * secondNumber));
  }

  @Override
  public NumberType divide(NumberType number) {
    this.createArithmeticException(!this.canBeCalculated(this.getRadix(), number.getRadix()));
    int firstNumber = this.parseNumber(this.getNumber(), this.getRadix());
    int secondNumber = this.parseNumber(number.getNumber(), number.getRadix());
    return new OctalNumber(Integer.toOctalString(firstNumber / secondNumber));
  }
}
