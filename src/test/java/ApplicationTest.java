import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ApplicationTest {

  private final Application application = new Application();

  @Test
  public void whenThreeNumbersAreGivenChecksSumOfFirstTwoNumbersIsEqualToThirdNumberProvidedReturnsTrue() {
    boolean euqalOrNotEquals = application.checkIfThirdNumberGivenIsEqualToSumOfFirstTwoNumbers(
      1, 2, 3);
    Assert.assertTrue(euqalOrNotEquals);
  }

  @Test
  public void whenThreeNumbersAreGivenChecksSumOfFirstTwoNumbersIsEqualToThirdNumberProvidedReturnsFalse() {
    boolean euqalOrNotEquals = application.checkIfThirdNumberGivenIsEqualToSumOfFirstTwoNumbers(
      2, 2, 3);
    Assert.assertFalse(euqalOrNotEquals);
  }

  @Test
  public void whenThreeNumbersAreGivenCheckSumOfFirstTwoNumbersIsEqualToThirdNumberProvidedReturnsFalse() {
    boolean euqalOrNotEquals = application.checkIfThirdNumberGivenIsEqualToSumOfFirstTwoNumbers(
      1, 2, 10);
    Assert.assertFalse(euqalOrNotEquals);
  }

  @Test
  public void whenThreeNumbersAreGivenCheckSumOfFirstTwoNumbersIsEqualToThirdNumberProvidedReturnsTrue() {
    boolean euqalOrNotEquals = application.checkIfThirdNumberGivenIsEqualToSumOfFirstTwoNumbers(
      2, 5, 7);
    Assert.assertTrue(euqalOrNotEquals);
  }

  @Test
  public void whenThreeNegativeNumbersAreGivenCheckSumOfFirstTwoNumbersIsEqualToThirdNumberProvidedReturnsTrue() {
    boolean euqalOrNotEquals = application.checkIfThirdNumberGivenIsEqualToSumOfFirstTwoNumbers(
      -2, -5, -7);
    Assert.assertTrue(euqalOrNotEquals);
  }

  @Test
  public void whenNumbersAreGivenCheckSumOfFirstTwoNumbersIsEqualToThirdNumberProvidedReturnsTrue() {
    boolean euqalOrNotEquals = application.checkIfThirdNumberGivenIsEqualToSumOfFirstTwoNumbers(
      -2, -5, 7);
    Assert.assertFalse(euqalOrNotEquals);
  }

  @Test
  public void givenTwoNumbersWhichPairMatchesTheSumProvided() {
    int[] collectionOfNumbers = new int[]{1, 2};
    int sum = 3;
    boolean sumMatchesACollectionOfNumbersSum = application.checkIfGivenSumEqualsSetOfNumbersProvided(
      collectionOfNumbers, sum);
    Assert.assertTrue(sumMatchesACollectionOfNumbersSum);
  }

  @Test
  public void givenACollectionOfNumbersWhichPairMatchesTheSumProvidedReturnsTrue() {
    int[] collectionOfNumbers = new int[]{1, 3, 3};
    int sum = 6;
    boolean sumMatchesACollectionOfNumbersSum = application.checkIfGivenSumEqualsSetOfNumbersProvided(
      collectionOfNumbers, sum);
    Assert.assertTrue(sumMatchesACollectionOfNumbersSum);
  }

  @Test
  public void givenACollectionOfNumbersWhichPairMatchesTheSumProvidedReturnsFalse() {
    int[] collectionOfNumbers = new int[]{0, 1, 0, 0, 4};
    int sum = 4;
    boolean sumMatchesACollectionOfNumbersSum = application.checkIfGivenSumEqualsSetOfNumbersProvided(
      collectionOfNumbers, sum);
    Assert.assertTrue(sumMatchesACollectionOfNumbersSum);
  }

  @Test
  public void givenACollectionOfNumbersWhichPairMatchesItReturnsThatPair() {
    int[] collectionOfNumbers = new int[]{0, 1, 0, 0, 2, 6, 0, 7, 0, 4};
    int sum = 4;
    int[] expectedArray = new int[]{0,4};
    int[] numbersThatWhenSummed = application.checkIfGivenSumEqualsSetOfNumbersProvidedAndReturnThoseNumbers(
      collectionOfNumbers, sum);
    Assert.assertArrayEquals(expectedArray, numbersThatWhenSummed);
  }


}
