/**
 * .
 */
public class Calculadora {

  public static double calcularIMC(double peso, double altura) {
    return peso / (altura * altura);
  }

  /**
   * .
   */
  public static String situacaoIMC(double imc) {
    if (imc < 18.5) {
      return "Abaixo do peso";
    } else if (imc >= 18.5 && imc < 24.9) {
      return "Peso ideal";
    } else if (imc >= 24.9 && imc < 30) {
      return "Excesso de peso";
    } else if (imc >= 30.0 && imc < 35.0) {
      return "Obesidade classe I";
    } else if (imc >= 35.0 && imc < 40.0) {
      return "Obesidade classe II";
    } else {
      return "Obesidade III";
    }
  }

  public static double converterCelciusParaFareheint(double celsius) {
    return (celsius * 9 / 5) + 32;
  }
}
