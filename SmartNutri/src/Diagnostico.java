import java.util.Scanner;

/**
 * .
 */
public class Diagnostico {

  /**
   * .
   */
  public static void main(String[] args) {
    Scanner instanciaDeScanner = new Scanner(System.in);

    System.out.println("Qual o se peso?");
    String pesoEntrada = instanciaDeScanner.next();

    System.out.println("Qual a sua altura?");
    String alturaEntrada = instanciaDeScanner.next();

    // Conversão;
    double peso = Double.parseDouble(pesoEntrada);
    double altura = Double.parseDouble(alturaEntrada);

    Avaliacao instaciaDeAvaliacao = new Avaliacao();
    instaciaDeAvaliacao.calcularIMC(peso, altura);

    instanciaDeScanner.close();
  }

}
