import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Admin admin = new Admin();
    admin.AddDoctors();

    System.out.println("-------------------------------");
    System.out.println("Seja bem-vindo ao Medical Care");
    System.out.println("-------------------------------");

    System.out.println("Quem é você?\n \n1. Médico \n2. Paciente\n");
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite: ");
    Integer login = sc.nextInt();

    switch (login) {
      // doctor
      case 1:
        LoginDoctor loginDoctor = new LoginDoctor();
        Credentials logIn = loginDoctor.login();

        if (!admin.getLoginDoctor().containsKey(logIn)) {
          System.out.println("Crendenciais inválidas!");
          System.exit(1);
        }

        // pegando o valor da hashmap de acordo com o logIn que foi digitado
        Doctor doctor = admin.getLoginDoctor().get(logIn);
        System.out.println(doctor);

        break;
      // patient
      case 2:

        break;
      default:
        System.out.println("Código inválido! Reenvie.");
        break;
    }

  }
}
