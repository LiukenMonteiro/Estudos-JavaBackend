/**
 * .
 */
public class UtilStringBuilder {

  /**
   * terceiro método - usando StringBuilder.
   */
  public static void main(String[] args) {
    String original = "Hello, World!";
    StringBuilder reversed = new StringBuilder(original).reverse();

    System.out.println("-----------Usando StringBuilder-----------\n");
    System.out.println("String original: " + original);
    System.out.println("String revertida: " + reversed.toString());
  }
}
