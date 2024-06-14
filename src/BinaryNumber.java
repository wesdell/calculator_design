public class BinaryNumber extends NumberType {
  public BinaryNumber(String number) {
    super(number);
  }

  @Override
  public double parseToDouble() {
    return Integer.parseInt(this.toString(), BINARY_RADIX);
  }
}
