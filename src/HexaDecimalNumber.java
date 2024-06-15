public class HexaDecimalNumber extends Number {
  public HexaDecimalNumber(String number) {
    super(number);
  }

  @Override
  public double parseToDecimalNumber() {
    return Integer.parseInt(this.toString(), 16);
  }
}
