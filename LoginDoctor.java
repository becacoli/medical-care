import java.util.Scanner;

public class LoginDoctor implements Login {

  @Override
  public Credentials login() {

    System.out.println("Olá novamente \n \nDigite seu usuário: ");
    Scanner sc = new Scanner(System.in);
    String user = sc.next();
    System.out.print("Digite sua senha:\n ");
    System.out.println();
    String senha = sc.next();
    System.out.printf(senha);

    System.out.println("\nDigite 0 para entrar: ");
    String entrar = sc.next();

    if (entrar != "0") {
      System.out.println("Tente novamente");
    }

    sc.close();
    return new Credentials(user, senha);
  }

}
