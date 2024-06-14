public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    NumberType num1 = new RomanNumber("V");
    NumberType num2 = new RealNumber("1");

    System.out.println(calculator.sum(num1, num2));
    System.out.println(calculator.subtract(num1, num2));
    System.out.println(calculator.multiply(num1, num2));
    System.out.println(calculator.divide(num1, num2));
  }
}