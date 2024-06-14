public class RomanNumber extends NumberType {
  public RomanNumber(String number) {
    super(number);
  }

  @Override
  public double parseToDouble() {
    int[] romanValues = new int[256];
    romanValues['I'] = 1;
    romanValues['V'] = 5;
    romanValues['X'] = 10;
    romanValues['L'] = 50;
    romanValues['C'] = 100;
    romanValues['D'] = 500;
    romanValues['M'] = 1000;

    double newNumber = 0;
    for (int i = 0; i < this.toString().length(); i++) {
      int romanValue = romanValues[this.toString().charAt(i)];
      if (i < this.toString().length() - 1 && romanValue < romanValues[this.toString().charAt(i + 1)]) {
        newNumber -= romanValue;
      } else {
        newNumber += romanValue;
      }
    }
    return newNumber;
  }
}
