public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    NumberType num1 = new RealNumber("10");
    NumberType num2 = new RealNumber("01");

    System.out.println(calculator.sum(num1, num2));
    System.out.println(calculator.subtract(num1, num2));
    System.out.println(calculator.multiply(num1, num2));
    System.out.println(calculator.divide(num1, num2));
  }
}