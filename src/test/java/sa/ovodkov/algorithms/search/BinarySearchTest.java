package sa.ovodkov.algorithms.search;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import sa.ovodkov.algorithms.search.binary.BinarySearch;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Проверка реализации алгоритма бинарный поиск
 *
 * @author Ovodkov Sergey created on 25.05.2021
 */
@DisplayName("Проверка работы реализации бинарного поиска")
class BinarySearchTest {

  private final List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

  @ParameterizedTest
  @CsvSource({
          "9, 8",   // стандартный случай
          "1, 0",   // искомый элемент первый в списке
          "12, 11"  //искомый элемент последний в списке
  })
  void searchTest(int targetValue, int expectedResult) {
      int actualResult = BinarySearch.search(list, targetValue);
      assertEquals(expectedResult, actualResult);
  }

  @Test
  @DisplayName("Искомого элемента нету в списке")
  void search4() {
    int targetValue = 99;
    int expectedResult = -1;

    int actualResult = BinarySearch.search(list, targetValue);

    assertEquals(expectedResult, actualResult);
  }

  @Test
  @DisplayName("Список состоит из одного элемента")
  void search5() {
    List<Integer> smallList = List.of(1, 2);
    int targetValue = 2;
    int expectedResult = 1;

    int actualResult = BinarySearch.search(smallList, targetValue);

    assertEquals(expectedResult, actualResult);
  }

  @Test
  @DisplayName("Пустой список")
  void search6() {
    List<Integer> emptyList = new ArrayList<>();
    int targetValue = 99;
    int expectedResult = -1;

    int actualResult = BinarySearch.search(emptyList, targetValue);

    assertEquals(expectedResult, actualResult);
  }
}
