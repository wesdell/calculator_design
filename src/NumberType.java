public abstract class NumberType {
  public static final int REAL_RADIX = 10;
  public static final int BINARY_RADIX = 2;
  public static final int HEXADECIMAL_RADIX = 16;
  public static final int OCTAL_RADIX = 8;

  private String number;

  public NumberType(String number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return this.number;
  }

  public abstract double parseToDouble();
}
