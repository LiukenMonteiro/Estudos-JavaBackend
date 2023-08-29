public class Main {

  public static void main(String[] args) {
    String saudacao = "Olá, Mundo!";

    System.out.println(saudacao.indexOf('M')); // imprime: 5

    String transacao = "123.45MCAD"; // Informação recebida de outro sistema

    int separador = transacao.indexOf("M");

    System.out.println(separador);
  }
}