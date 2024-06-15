public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Number num1 = new RomanNumber("V");      // 5
    Number num2 = new ComplexNumber("3+4i"); // 5

    System.out.println(calculator.sum(num1, num2));
    System.out.println(calculator.subtract(num1, num2));
    System.out.println(calculator.multiply(num1, num2));
    System.out.println(calculator.divide(num1, num2));
  }
}