public class Calculator {
    public NumberType sum(NumberType firstNumber, NumberType secondNumber) {
    double result = firstNumber.parseToDouble() + secondNumber.parseToDouble();
    return this.toRealNumber(String.valueOf(result));
  }

  public NumberType subtract(NumberType firstNumber, NumberType secondNumber) {
    double result = firstNumber.parseToDouble() - secondNumber.parseToDouble();
    return this.toRealNumber(String.valueOf(result));
  }

  public NumberType multiply(NumberType firstNumber, NumberType secondNumber) {
    double result = firstNumber.parseToDouble() * secondNumber.parseToDouble();
    return this.toRealNumber(String.valueOf(result));
  }

  public NumberType divide(NumberType firstNumber, NumberType secondNumber) {
    if (this.verifyNonZeroDivision(secondNumber)) {
      throw new ArithmeticException("Divide by zero");
    }
    double result = firstNumber.parseToDouble() / secondNumber.parseToDouble();
    return this.toRealNumber(String.valueOf(result));
  }

  public NumberType toRealNumber(String number) {
      return new RealNumber(number);
  }

  public boolean verifyNonZeroDivision(NumberType number) {
      return number.parseToDouble() == 0;
  }
}
