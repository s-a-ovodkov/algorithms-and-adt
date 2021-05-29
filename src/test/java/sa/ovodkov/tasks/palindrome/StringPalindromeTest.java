package sa.ovodkov.tasks.palindrome;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Проверка решения задачи определения является ли строка палиндромом
 *
 * @author Ovodkov Sergey created on 29.05.2021
 */
@DisplayName("Проверка определения является ли строка палиндромом")
class StringPalindromeTest {

  @ParameterizedTest
  @CsvSource({
          "motor, false",
          "rotor, true",
          "racecar, true",
          "foobar, false",
          "roor, true"
  })
  void isPalindromeRecursive(String str, boolean expectedResult) {
    boolean actualResult = StringPalindrome.isPalindromeRecursive(str);

    assertEquals(expectedResult, actualResult);
  }

  @ParameterizedTest
  @CsvSource({
          "motor, false",
          "rotor, true",
          "racecar, true",
          "foobar, false",
          "roor, true"
  })
  void isPalindromeImperative(String str, boolean expectedResult) {
    boolean actualResult = StringPalindrome.isPalindromeImperative(str);

    assertEquals(expectedResult, actualResult);
  }
}
