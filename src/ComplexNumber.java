public class ComplexNumber extends Number {
  private final double realPart;
  private final double imaginaryPart;

  public ComplexNumber(String number) {
    super(number);
    String[] parts = number.split("[+i]");
    this.realPart = Double.parseDouble(parts[0]);
    this.imaginaryPart = Double.parseDouble(parts[1]);
  }

  @Override
  public double parseToDecimalNumber() {
    return Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
  }
}
