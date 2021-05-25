package sa.ovodkov.algorithms.search;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Реализация алгоритма "Бинарный поиск"
 *
 * @author Ovodkov Sergey created on 25.05.2021
 */
public class BinarySearch {

  /**
   * Поиск индекса первого вхождения указанного элемента в массив
   *
   * @param list массив значений среди которых производится поиск
   * @param targetValue искомое значение
   * @param <T> тип элемента списка,
   *            тип элемента должен реализовывать интерфейс {@link Comparable<T>}
   * @return индекс первого вхождения указанного элемента, если указанного элемента возвращается -1
   */
  public static <T extends Comparable<T>> int search(@NotNull List<T> list,
                                                     @NotNull T targetValue) {
    int left = 0;
    int right = list.size() - 1;
    int guess = (right - left) / 2;
    while (right >= left) {
      if (list.get(guess).compareTo(targetValue) == 0) return guess;
      else if (list.get(guess).compareTo(targetValue) < 0) left = guess + 1;
      else right = guess - 1;
      guess = left + ((right - left) / 2);
    }
    return -1;
  }
}
