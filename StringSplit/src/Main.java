public class Main {

  public static void main(String[] args) {
    String casasTexto = "Grifinória;Sonseria;Corvinal;Lufa-Lufa\n";
    String casas[] = casasTexto.split(";");
    //String casas[] = casasTexto.split("\\d+"); para números

    for (String casa : casas) {
      System.out.println(casa);
    }

    String frase = "caneta,lápis,lapiseira,caderno,borracha";
    String formatado[] = frase.split("[a/á]", 0);

    for (String novo_formato : formatado) {
      System.out.println(novo_formato); // imprime ["caneta", "lápis", "lapiseira,caderno,borracha"]
    }

    String frase2 = "carro-barco-navio-moto--";
    String formato[] = frase2.split("-", 2);

    for (String novo : formato) {
      System.out.println(novo);
    }
  }
}