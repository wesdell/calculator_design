public class Calculator {
  private final NumberType firstNumber;
  private final NumberType secondNumber;
  private NumberType result;

  public Calculator(NumberType firstUserNumber, NumberType secondUserNumber) {
    this.createArithmeticException(!this.canBeCalculated(firstUserNumber.getRadix(), secondUserNumber.getRadix()));
    this.firstNumber = firstUserNumber;
    this.secondNumber = secondUserNumber;
    this.result = firstUserNumber;
  }

    public NumberType sum() {
    int num1 = this.parseNumber(this.firstNumber.getNumber(), this.firstNumber.getRadix());
    int num2 = this.parseNumber(this.secondNumber.getNumber(), this.secondNumber.getRadix());
    this.result = this.result.parse(num1 + num2);
    return this.result;
  }

  public NumberType subtract() {
    int num1 = this.parseNumber(this.firstNumber.getNumber(), this.firstNumber.getRadix());
    int num2 = this.parseNumber(this.secondNumber.getNumber(), this.secondNumber.getRadix());
    this.result = this.result.parse(num1 - num2);
    return this.result;
  }

  public NumberType multiply() {
    int num1 = this.parseNumber(this.firstNumber.getNumber(), this.firstNumber.getRadix());
    int num2 = this.parseNumber(this.secondNumber.getNumber(), this.secondNumber.getRadix());
    this.result = this.result.parse(num1 * num2);
    return this.result;
  }

  public NumberType divide() {
    int num1 = this.parseNumber(this.firstNumber.getNumber(), this.firstNumber.getRadix());
    int num2 = this.parseNumber(this.secondNumber.getNumber(), this.secondNumber.getRadix());
    this.result = this.result.parse(num1 * num2);
    return this.result;
  }

  public int parseNumber(String number, int radix) {
    return Integer.parseInt(number, radix);
  }

  public boolean canBeCalculated(int firstRadix, int secondRadix) {
    return firstRadix == secondRadix;
  }

  public void createArithmeticException(boolean operable) {
    if (operable) {
      throw new ArithmeticException("The numbers must be of the same instance.");
    }
  }
}
