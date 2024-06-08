public class BinaryNumber extends NumberType {
  public BinaryNumber(String number) {
    super(number, BINARY_RADIX);
  }

  @Override
  public NumberType parse(int number) {
    return new BinaryNumber(Integer.toBinaryString(number));
  }
}
