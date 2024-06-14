public class OctalNumber extends NumberType {
  public OctalNumber(String number) {
    super(number);
  }

  @Override
  public double parseToDouble() {
    return Integer.parseInt(this.toString(), OCTAL_RADIX);
  }
}
