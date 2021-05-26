package sa.ovodkov.algorithms.sort.insertion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Проверка реализации алгоритма сортировки вставками
 *
 * @author Ovodkov Sergey created on 27.05.2021
 */
@DisplayName("Сортировка вставками")
class InsertionSortTest {

  @Test
  @DisplayName("стандартный случай")
  void sort1() {
    List<Integer> list = Arrays.asList(3, 2, 5, 1, 4);
    List<Integer> expectedResult = Arrays.asList(1, 2, 3, 4, 5);

    InsertionSort.sort(list);

    assertEquals(expectedResult, list);
  }

  @Test
  @DisplayName("список из одного элемента")
  void sort2() {
    List<Integer> list = Collections.singletonList(3);
    List<Integer> expectedResult = Collections.singletonList(3);

    InsertionSort.sort(list);

    assertEquals(expectedResult, list);
  }

  @Test
  @DisplayName("пустой список")
  void sort3() {
    List<Integer> list = new ArrayList<>();
    List<Integer> expectedResult = new ArrayList<>();

    InsertionSort.sort(list);

    assertEquals(expectedResult, list);
  }
}
