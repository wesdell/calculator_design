public class BinaryNumber extends Number {
  public BinaryNumber(String number) {
    super(number);
  }

  @Override
  public double parseToDecimalNumber() {
    return Integer.parseInt(this.toString(), 2);
  }
}
