
/**
 * .
 */
public class ReverseString {

  /**
   * segundo método - Usando um loop.
   */
  public static void main(String[] args) {
    String original = "Hello, World!";
    String reversed = "";

    for (int i = original.length() - 1; i >= 0; i--) {
      reversed += original.charAt(i);
    }

    System.out.println("-----------Usando Loop-----------\n");
    System.out.println("String original: " + original);
    System.out.println("String revertida: " + reversed);
  }


}



