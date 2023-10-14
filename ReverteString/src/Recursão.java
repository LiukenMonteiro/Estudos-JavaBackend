/**
 * .
 */
public class Recursão {

  /**
   * Quarto método - Usando recursão.
   */
  public static void main(String[] args) {
    String original = "Hello, World!";
    String reversed = reverseString(original);

    System.out.println("-----------Usando Recursão-----------\n");
    System.out.println("String original: " + original);
    System.out.println("String revertida: " + reversed);
  }

  private static String reverseString(String str) {
    if (str.isEmpty()) {
      return str;
    } else {
      return reverseString(str.substring(1)) + str.charAt(0);
    }
  }
}
