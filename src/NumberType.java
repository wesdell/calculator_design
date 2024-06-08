public abstract class NumberType {
  public static final int REAL_RADIX = 10;
  public static final int BINARY_RADIX = 2;
  public static final int HEXADECIMAL_RADIX = 16;
  public static final int OCTAL_RADIX = 8;

  private final String number;
  private final int radix;

  public NumberType(String number, int radix) {
    this.number = number;
    this.radix = radix;
  }

  public String getNumber() {
    return this.number;
  }

  public int getRadix() {
    return this.radix;
  }

  @Override
  public String toString() {
    return this.number;
  }

  public abstract NumberType parse(int number);
}
