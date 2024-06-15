public class Calculator {
    public String sum(Number firstNumber, Number secondNumber) {
    double result = firstNumber.parseToDecimalNumber() + secondNumber.parseToDecimalNumber();
    return String.valueOf(result);
  }

  public String subtract(Number firstNumber, Number secondNumber) {
    double result = firstNumber.parseToDecimalNumber() - secondNumber.parseToDecimalNumber();
    return String.valueOf(result);
  }

  public String multiply(Number firstNumber, Number secondNumber) {
    double result = firstNumber.parseToDecimalNumber() * secondNumber.parseToDecimalNumber();
    return String.valueOf(result);
  }

  public String divide(Number firstNumber, Number secondNumber) {
    if (this.verifyNonZeroDivision(secondNumber)) {
      throw new ArithmeticException("Divide by zero");
    }
    double result = firstNumber.parseToDecimalNumber() / secondNumber.parseToDecimalNumber();
    return String.valueOf(result);
  }

  public boolean verifyNonZeroDivision(Number number) {
      return number.parseToDecimalNumber() == 0;
  }
}
