public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    NumberType firstNumber =  new RealNumber("10");
    NumberType secondNumber =  new RealNumber("01");

    System.out.println(calculator.sum(firstNumber, secondNumber));
    System.out.println(calculator.subtract(firstNumber, secondNumber));
    System.out.println(calculator.multiply(firstNumber, secondNumber));
    System.out.println(calculator.divide(firstNumber, secondNumber));
  }
}