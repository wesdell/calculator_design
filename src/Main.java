public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator(
            new RealNumber("10"),
            new RealNumber("01")
    );

    System.out.println(calculator.sum());
    System.out.println(calculator.subtract());
    System.out.println(calculator.multiply());
    System.out.println(calculator.divide());
  }
}