/**
 * .
 */
public class TiposPrimitivos {

  /**
   * .
   */
  public static void main(String[] args) {
    int a = 20;
    int b = 10;

    // Realiza operações matemáticas

    // Inteiro
    int num = 300;
    int soma = a + b;
    int subtracao = a - b;
    int divisao = a / b;
    int multiplicacao = a * b;
    int restoDeDivisao = a % b;
    // Short
    short formataComUnderscore = 20_000;
    // Long
    long numA = 102040;
    long numB = 102030405060L;
    // Float
    float numFloatA = -101.23f;
    float numFloatB = 2.356f;
    // Double
    double doubleNormal = 2.356; // double inicializado naturalmente
    double doubleRecebendoLong = 12930L; // double aceitando número long
    double doubleRecebendoFloat = 1.409F; // double aceitando número float

    // Imprime os resultados

    // Inteiros
    System.out.println("numero: " + num);
    System.out.println("numero grande: " + formataComUnderscore);
    System.out.println("Soma: " + soma); // Soma: 30
    System.out.println("Subtração: " + subtracao); // Subtração: 10
    System.out.println("Divisão: " + divisao); // Divisão: 2
    System.out.println("Multiplicação: " + multiplicacao); // Multiplicação: 200
    System.out.println("Resto de Divisão: " + restoDeDivisao); // Resto de Divisão: 0
    // Longos
    System.out.println("numero muito longo: " + numB);
    System.out.println("numero longo: " + numA);
    // Float
    System.out.println("Resultado da soma: " + (numFloatA + numFloatB)); // -98.874
    // Double
    System.out.println("Duble normal: " + doubleNormal);
    System.out.println("Double long: " + doubleRecebendoLong); // 12930.0
    System.out.println("Double float: " + doubleRecebendoFloat); // 1.409000039100647
  }
}
