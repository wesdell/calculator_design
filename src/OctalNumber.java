public class OctalNumber extends NumberType {
  public OctalNumber(String number) {
    super(number, OCTAL_RADIX);
  }

  @Override
  public NumberType parse(int number) {
    return new OctalNumber(Integer.toOctalString(number));
  }
}
