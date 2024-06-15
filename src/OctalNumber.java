public class OctalNumber extends Number {
  public OctalNumber(String number) {
    super(number);
  }

  @Override
  public double parseToDecimalNumber() {
    return Integer.parseInt(this.toString(), 8);
  }
}
