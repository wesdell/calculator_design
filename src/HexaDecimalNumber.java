public class HexaDecimalNumber extends NumberType {
  public HexaDecimalNumber(String number) {
    super(number);
  }

  @Override
  public double parseToDouble() {
    return Integer.parseInt(this.toString(), HEXADECIMAL_RADIX);
  }
}
