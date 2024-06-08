public class BinaryNumber extends NumberType {
  public BinaryNumber(String number) {
    super(number);
  }

  @Override
  public NumberType sum(NumberType number) {
    return new BinaryNumber(this.getNumber() + number);
  }

  @Override
  public NumberType subtract(NumberType number) {
    return null;
  }

  @Override
  public NumberType multiply(NumberType number) {
    return null;
  }

  @Override
  public NumberType divide(NumberType number) {
    return null;
  }
}
