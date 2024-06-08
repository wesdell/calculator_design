public class BinaryNumber extends NumberType {
  public BinaryNumber(String number) {
    super(number, BINARY_RADIX);
  }

  @Override
  public NumberType sum(NumberType number) {
    this.createArithmeticException(!this.canBeCalculated(this.getRadix(), number.getRadix()));
    int firstNumber = this.parseNumber(this.getNumber(), this.getRadix());
    int secondNumber = this.parseNumber(number.getNumber(), number.getRadix());
    return new BinaryNumber(Integer.toBinaryString(firstNumber + secondNumber));
  }

  @Override
  public NumberType subtract(NumberType number) {
    this.createArithmeticException(!this.canBeCalculated(this.getRadix(), number.getRadix()));
    int firstNumber = this.parseNumber(this.getNumber(), this.getRadix());
    int secondNumber = this.parseNumber(number.getNumber(), number.getRadix());
    return new BinaryNumber(Integer.toBinaryString(firstNumber - secondNumber));
  }

  @Override
  public NumberType multiply(NumberType number) {
    this.createArithmeticException(!this.canBeCalculated(this.getRadix(), number.getRadix()));
    int firstNumber = this.parseNumber(this.getNumber(), this.getRadix());
    int secondNumber = this.parseNumber(number.getNumber(), number.getRadix());
    return new BinaryNumber(Integer.toBinaryString(firstNumber * secondNumber));
  }

  @Override
  public NumberType divide(NumberType number) {
    this.createArithmeticException(!this.canBeCalculated(this.getRadix(), number.getRadix()));
    int firstNumber = this.parseNumber(this.getNumber(), this.getRadix());
    int secondNumber = this.parseNumber(number.getNumber(), number.getRadix());
    return new BinaryNumber(Integer.toBinaryString(firstNumber * secondNumber));
  }
}
