package sa.ovodkov.algorithms.sort.insertion;

import java.util.List;

/**
 * Реализация алгоритма сортировка вставками
 *
 * @author Ovodkov Sergey created on 27.05.2021
 */
public class InsertionSort {

  private InsertionSort() {}

  /**
   * Сортировка списка элементов алгоритмом сортировки вставками
   *
   * @param list список элементов
   * @param <T> тип элементов списка,
   *            тип элемента должен реализовывать интерфейс {@link Comparable<T>}
   */
  public static <T extends Comparable<T>> void sort(List<T> list) {
    for (int i = 0; i < list.size(); i++) {
      insert(list, i, list.get(i));
    }
  }

  private static <T extends Comparable<T>> void insert(List<T> list, int rightIndex, T value) {
    for (int i = rightIndex - 1; i >= 0 && list.get(i).compareTo(value) > 0; i--) {
      list.set(i + 1, list.get(i));
      list.set(i, value);
    }
  }
}
