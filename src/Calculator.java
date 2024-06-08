public class Calculator {
  public NumberType sum(NumberType firstNumber, NumberType secondNumber) {
    return firstNumber.sum(secondNumber);
  }

  public NumberType subtract(NumberType firstNumber, NumberType secondNumber) {
    return firstNumber.subtract(secondNumber);
  }

  public NumberType multiply(NumberType firstNumber, NumberType secondNumber) {
    return firstNumber.multiply(secondNumber);
  }

  public NumberType divide(NumberType firstNumber, NumberType secondNumber) {
    return firstNumber.divide(secondNumber);
  }
}
