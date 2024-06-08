public class HexaDecimalNumber extends NumberType {
  public HexaDecimalNumber(String number) {
    super(number, HEXADECIMAL_RADIX);
  }

  @Override
  public NumberType parse(int number) {
    return new HexaDecimalNumber(Integer.toHexString(number));
  }
}
