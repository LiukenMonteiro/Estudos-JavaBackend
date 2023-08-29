import java.util.Scanner;

/**
 * .
 */
public class Main {

  /**
   * .
   */
  public static void main(String[] args) {
    String opcao;
    Scanner scanner = new Scanner(System.in);

    do {

      menu();
      opcao = scanner.nextLine();

      switch (opcao) {
        case "1":
          opcaoIMC(scanner);
          break;

        case "2":
          opcaoConverterCelciusFarenheit(scanner);
          break;

        case "X":
        case "x":
          System.out.println("Bye bye!");
          break;
        default:
          System.out.println("Opção inválida!");
          System.out.println();
          System.out.println("______________________________________________________");
      }

    } while (!opcao.equalsIgnoreCase("x"));
    scanner.close();

  }

  private static void opcaoConverterCelciusFarenheit(Scanner scanner) {
    System.out.println();
    System.out.println("Digite a temperatura em graus Celcius: ");
    double celsius = Double.parseDouble(scanner.nextLine());
    double farenheit = Calculadora.converterCelciusParaFareheint(celsius);
    System.out.println("A temperatura em Farenheit é " + farenheit);
    System.out.println();
    System.out.println("______________________________________________________");

  }

  private static void menu() {
    System.out.println("Selecione uma das opções abaixo");
    System.out.println();
    System.out.println("1 - Calcule IMC");
    System.out.println("2 - Converter de graus Celcius para graus Farenheit");
    System.out.println("X - Sair");
    System.out.println();
  }

  private static void opcaoIMC(Scanner scanner) {
    System.out.println();

    System.out.println("Digite o seu peso: ");
    double peso = Double.parseDouble(scanner.nextLine());

    System.out.println("Digite o sua altura: ");
    double altura = Double.parseDouble(scanner.nextLine());

    double imc = Calculadora.calcularIMC(peso, altura);
    String resultado = Calculadora.situacaoIMC(imc);

    System.out.println("Situação do seu IMC: " + resultado);
    System.out.println();
    System.out.println("______________________________________________________");

  }
}