import java.util.Scanner;

class UsandoScanner {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Qual o seu nome: ");
    String nome = scanner.next();
    System.out.print("Qual sua idade " + nome + "?: ");
    String idade = scanner.next();
    System.out.print("Boas-vindas, " + nome + "!" + " você tem " + idade + " anos");
    scanner.close();
  }

}