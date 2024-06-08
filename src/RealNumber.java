public class RealNumber extends NumberType {
  public RealNumber(String number) {
    super(number);
  }

  @Override
  public NumberType sum(NumberType number) {
    double firstNumber = Double.parseDouble(this.getNumber());
    double secondNumber = Double.parseDouble(number.getNumber());
    String result = String.valueOf(firstNumber + secondNumber);
    return new RealNumber(result);
  }

  @Override
  public NumberType subtract(NumberType number) {
    double firstNumber = Double.parseDouble(this.getNumber());
    double secondNumber = Double.parseDouble(number.getNumber());
    String result = String.valueOf(firstNumber - secondNumber);
    return new RealNumber(result);
  }

  @Override
  public NumberType multiply(NumberType number) {
    double firstNumber = Double.parseDouble(this.getNumber());
    double secondNumber = Double.parseDouble(number.getNumber());
    String result = String.valueOf(firstNumber * secondNumber);
    return new RealNumber(result);
  }

  @Override
  public NumberType divide(NumberType number) {
    double firstNumber = Double.parseDouble(this.getNumber());
    double secondNumber = Double.parseDouble(number.getNumber());
    if (secondNumber == 0) {
      throw new ArithmeticException("Divide by zero");
    }
    String result = String.valueOf(firstNumber / secondNumber);
    return new RealNumber(result);
  }
}
