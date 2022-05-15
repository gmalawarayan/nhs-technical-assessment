public class Application {

  public static void main(String[] args) {

  }

  public boolean checkIfThirdNumberGivenIsEqualToSumOfFirstTwoNumbers(int first,
    int second, int third) {
    boolean isSumOfFirstTwoNumbersEqualToThirdNumber;
    int sumOfFirstTwoNumbers = first + second;
    isSumOfFirstTwoNumbersEqualToThirdNumber = sumOfFirstTwoNumbers == third;
    return isSumOfFirstTwoNumbersEqualToThirdNumber;
  }

  public boolean checkIfGivenSumEqualsSetOfNumbersProvided(
    int[] collectionOfNumbers, int sum) {
    boolean calculatedSumEqualsSumProvided = false;
    int elementNPlusOne = 0;
    int elementOne = 0;
    for (int i = 0; i < collectionOfNumbers.length - 1; i++) {
      elementOne = collectionOfNumbers[i];
      elementNPlusOne = collectionOfNumbers[i + 1];
      if (sum == elementOne + elementNPlusOne) {
        calculatedSumEqualsSumProvided = true;
      }
    }
    return calculatedSumEqualsSumProvided;
  }

  public int[] checkIfGivenSumEqualsSetOfNumbersProvidedAndReturnThoseNumbers(
    int[] collectionOfNumbers, int sum) {
    int elementNPlusOne = 0;
    int elementOne = 0;
    int[] elements = new int[2];
    for (int i = 0; i < collectionOfNumbers.length - 1; i++) {
      elementOne = collectionOfNumbers[i];
      elementNPlusOne = collectionOfNumbers[i + 1];
      if (sum == elementOne + elementNPlusOne) {
        elements[0] = elementOne;
        elements[1] = elementNPlusOne;
      }
    }
    return elements;
  }
}
