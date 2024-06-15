public abstract class Number {
  private String number;

  public Number(String number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return this.number;
  }

  public abstract double parseToDecimalNumber();
}
