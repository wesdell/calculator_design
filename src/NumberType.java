public abstract class NumberType {
  private final String number;

  public NumberType(String number) {
    this.number = number;
  }

  public String getNumber() {
    return this.number;
  }

  @Override
  public String toString() {
    return this.number;
  }

  public abstract NumberType sum(NumberType number);
  public abstract NumberType subtract(NumberType number);
  public abstract NumberType multiply(NumberType number);
  public abstract NumberType divide(NumberType number);
}
