public class RealNumber extends NumberType {
  public RealNumber(String number) {
    super(number, REAL_RADIX);
  }

  @Override
  public NumberType parse(int number) {
    return new RealNumber(Integer.toString(number));
  }
}
