import java.util.Arrays;

/**
 * .
 */
public class Main {

  /**
   * .
   */
  public static void main(String[] args) {
    int[][] matriz = new int[2][4];

    matriz[0][0] = 10;
    matriz[1][0] = 20;
    matriz[1][2] = 30;
    matriz[1][3] = 40;

    System.out.println(matriz[1][3]);

    StringBuilder stringBuilder = new StringBuilder();
    String eu = "Eu";
    String ja = " já";
    String sei = " sei";
    String usar = " usar";
    String strings = " Strings";
    String em = " em";
    String java = " Java";

    String frase = stringBuilder.append(eu)
        .append(ja)
        .append(sei)
        .append(usar)
        .append(strings)
        .append(em)
        .append(java)
        .toString();
    System.out.println(frase); // Eu já sei usar Strings em Java

    int[] arrayDeInteiros = new int[9];
    arrayDeInteiros[0] = 40;
    arrayDeInteiros[1] = 55;
    arrayDeInteiros[2] = 63;
    arrayDeInteiros[3] = 17;
    arrayDeInteiros[4] = 22;
    arrayDeInteiros[5] = 68;
    arrayDeInteiros[6] = 89;
    arrayDeInteiros[7] = 97;
    arrayDeInteiros[8] = 89;

    int[] arrayNumerous = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    System.out.println(arrayDeInteiros[8]); // 89
    System.out.println(arrayDeInteiros[2]); // 63
    System.out.println(arrayNumerous[2]); //

    //arrayDeInteiros[9] = 89;
    // Estoura a pilha porque tentamos inserir um valor em um espaço inexistente do array

    String[] arrayDeString = new String[2];
    arrayDeString[0] = "Na Trybe";
    arrayDeString[1] = " eu aprendo Java!";
    System.out.println(arrayDeString[0] + arrayDeString[1]); // Na Trybe eu aprendo Java!
    System.out.println("O tamanho do array é: " + arrayDeString.length); // 10

  }
}