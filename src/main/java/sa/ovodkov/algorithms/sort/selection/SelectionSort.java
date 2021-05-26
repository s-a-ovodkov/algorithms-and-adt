package sa.ovodkov.algorithms.sort.selection;

import java.util.List;

/**
 * Реализация алгоритма сортировки выбором
 *
 * @author Ovodkov Sergey created on 26.05.2021
 */
public class SelectionSort {

  private SelectionSort() {}

  /**
   * Реализация алгоритма сортировки выбором
   *
   * @param list Не упорядоченный список элементов
   * @param <T> тип элементов списка,
   *            тип элемента должен реализовывать интерфейс {@link  Comparable<T>}
   */
  public static <T extends Comparable<T>> void sort(List<T> list) {
    for (int i = 0; i < list.size(); i++) {
      int secondIndex = indexOfMinimum(list, i);
      swap(list, i, secondIndex);
    }
  }

  private static <T extends Comparable<T>> int indexOfMinimum(List<T> list, int startIndex) {
    T minValue = list.get(startIndex);
    int minIndex = startIndex;
    for (int i = startIndex + 1; i < list.size(); i++) {
      if (minValue.compareTo(list.get(i)) > 0) {
        minValue = list.get(i);
        minIndex = i;
      }
    }
    return minIndex;
  }

  private static <T extends Comparable<T>> void swap(List<T> list,
                                                     int firstIndex,
                                                     int secondIndex) {
    T temp = list.get(secondIndex);
    list.set(secondIndex, list.get(firstIndex));
    list.set(firstIndex, temp);
  }
}
