package sa.ovodkov.algorithms.sort.selection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Проверка реализации алгоритма сортировки выбором
 *
 * @author Ovodkov Sergey created on 26.05.2021
 */
@DisplayName("Проверка реализации алгоритма сортировки выбором")
class SelectionSortTest {

  @Test
  @DisplayName("стандартный случай")
  void sort1() {
    List<Integer> list = Arrays.asList(34, 21, 33, 56, 2, 4, 98, 1, 22, 57, 39);
    List<Integer> expectedResult = List.of(1, 2, 4, 21, 22, 33, 34, 39, 56, 57, 98);

    SelectionSort.sort(list);

    assertEquals(expectedResult, list);
  }

  @Test
  @DisplayName("список с дублирующими элементами")
  void sort2() {
    List<Integer> list = Arrays.asList(34, 2, 33, 56, 2, 4, 4, 1, 22, 2, 39);
    List<Integer> expectedResult = List.of(1, 2, 2, 2, 4, 4, 22, 33, 34, 39, 56);

    SelectionSort.sort(list);

    assertEquals(expectedResult, list);
  }
}
