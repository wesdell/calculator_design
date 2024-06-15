public class DecimalNumber extends Number {
  public DecimalNumber(String number) {
    super(number);
  }

  @Override
  public double parseToDecimalNumber() {
    return Integer.parseInt(this.toString(), 10);
  }
}
