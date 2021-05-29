package sa.ovodkov.tasks.palindrome;

/**
 * Задача определить является ли переданная строка палиндромом
 *
 * @author Ovodkov Sergey created on 29.05.2021
 */
public class StringPalindrome {

  private StringPalindrome() {}

  /**
   * Определение является переданная строка палиндромом (используя рекурсивный метод)
   *
   * @param str строка которую необходимо проверить является ли она палиндромом
   * @return true - если переданная строка палиндром, иначе false
   */
  public static boolean isPalindromeRecursive(String str) {
    if (str.isEmpty() || str.length() == 1) {
      return true;
    } else if (str.charAt(0) == str.charAt(str.length() - 1)) {
      return isPalindromeRecursive(str.substring(1, str.length() - 1));
    }
    return false;
  }

  /**
   * Определение является переданная строка палиндромом (используя императивный метод)
   *
   * @param str строка которую необходимо проверить является ли она палиндромом
   * @return true - если переданная строка палиндром, иначе false
   */
  public static boolean isPalindromeImperative(String str) {
    if (str.isEmpty() || str.length() == 1) return true;
    for (int i = 0; i < str.length(); i++) {
      int end = str.length() - (i + 1);
      if (str.charAt(i) != str.charAt(end)) return false;
      if (end - i == 2 || end - i == 1) return true;
    }
    return false;
  }

  /**
   * Определение является переданная строка палиндромом (используя императивынй метод)
   * Этот метод проходится только по половине слова, что потенциально оптимальнее предыдущего
   * метода.
   *
   * @param str строка, которую необходимо проверить является ли она палиндромом
   * @return true - если переданная строка палиндром, иначе false
   */
  public static boolean isPalindromeOptimal(String str) {
    if (str.isEmpty() || str.length() == 1) return true;
    int end = str.length() - 1;
    int middle = str.length() / 2;
    for (int i = 0; i <= middle; i++) {
      if (str.charAt(i) != str.charAt(end - i)) return false;
    }
    return true;
  }
}
