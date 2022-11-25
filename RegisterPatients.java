import java.util.Scanner;

public class RegisterPatients {

  // botando o cara no sistema
  // levar ele pra tela de login após cadastro?
  // o q é preciso pra cadastar?

  public static Credentials signIn() {

    System.out.println("Digite os seguintes dados para se cadastrar: ");
    System.out.println("Digite seu nome: ");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();

    System.out.print("Digite seu email:  ");
    String email = sc.nextLine();

    System.out.println("Digte sua data de nascimento (DD/MM/AAAA): ");
    String birthDate = sc.nextLine();

    System.out.println("Digite sua senha: ");
    String password = sc.nextLine();


    sc.close();
    return new Credentials(name, email, birthDate, password);
  }
  
}
