/**
 * .
 */
public class Main {

  public static void main(String[] args) {
    String nomes = "Maria Magali, magali da Silva, Magali Medeiros";
    String pessoa = "Laura";

    // nomes = nomes.replace("Magali", pessoa);
    nomes = nomes.replaceAll("[Mm]agali", pessoa);
    // nomes = nomes.replaceFirst("Magali", pessoa);

    System.out.println(nomes); // imprime: Maria Laura, Laura da Silva, Laura Medeiros

    String numeroFormatado = "123456789";
    String numeroComVirgulas = numeroFormatado.replaceAll("(\\d)(?=(\\d{3})+$)", "$1,");
    System.out.println(numeroComVirgulas);
    // Saída: "123,456,789"

    String textoEspacos = "   Isso     tem    espaços    extras.   ";
    String textoLimpo = textoEspacos.replaceAll("\\s+", " ").trim();
    System.out.println(textoLimpo);
    // Saída: "Isso tem espaços extras."

  }
}