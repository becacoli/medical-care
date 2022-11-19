import java.util.Scanner;

public class LoginUser implements Login {

  @Override
  public Credentials login() {

    System.out.println("Olá novamente \n \nDigite seu usuário: ");
    Scanner sc = new Scanner(System.in);
    String user = sc.next();
    System.out.print("Digite sua senha:\n ");
    //System.out.println();
    String senha = sc.next();

    sc.close();
    return new Credentials(user.strip(), senha.strip());
  }

}
