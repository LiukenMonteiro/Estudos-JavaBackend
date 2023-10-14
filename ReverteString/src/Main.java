/**
 * .
 */
public class Main {

  /**
   * Primeiro metodo - Usando o reverse(().
   */
  public static void main(String[] args) {
    String str = "Hello, World!";
    String reverse = new StringBuffer(str).reverse().toString();

    System.out.println("-----------Usando reverse()-----------\n");
    System.out.println(reverse);
  }
}