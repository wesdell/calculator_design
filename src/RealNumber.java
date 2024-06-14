public class RealNumber extends NumberType {
  public RealNumber(String number) {
    super(number);
  }

  @Override
  public double parseToDouble() {
    return Integer.parseInt(this.toString(), REAL_RADIX);
  }
}
