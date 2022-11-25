import java.util.Scanner;


public class Main {
  public static void main(String[] args) {

    Admin admin = new Admin();
    admin.AddDoctors();
    admin.AddDummyPatients();

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
        LoginUser loginDoctor = new LoginUser();
        Credentials logIn = loginDoctor.login();

        Doctor doctor = admin.authDoctor(logIn);
        if(doctor != null) {
            System.out.printf("|Seus dados: \n|Nome: %s \n|E-mail: %s\n|Especialização: %s", doctor.name, doctor.email, doctor.specialization);
        } else {
          System.out.println("É nulo");
        }
              

        break;
      // patient
      case 2:
      System.out.println("-------------------------------------------");
       System.out.println("| Você já é paciente? Digite 1 para LOGAR |");
       System.out.println("-------------------------------------------");
       System.out.println("----------------------------------------------------");
       System.out.println("| Ainda não é paciente? Digite 2 para se CADASTRAR |");
       System.out.println("----------------------------------------------------");
        Integer resp = sc.nextInt();

        if (resp == 1){

          //login paciente

          LoginUser loginPatient = new LoginUser();
          Credentials logInP = loginPatient.login();

          Patients patient = admin.authPatient(logInP);

          if(patient != null) {
              System.out.println(patient.name);
          } else {
            System.out.println("É nulo");
          }

        } else if (resp == 2){
          //cadastro do paciente
          Credentials patientRegistration = RegisterPatients.signIn();
          Patients patient = new Patients(patientRegistration.name, patientRegistration.email, patientRegistration.birthDate, patientRegistration.password);
          admin.addPatients(patient);
          System.out.printf("|Seus dados: \n|Nome: %s \n|E-mail: %s\n|Data de nascimento: %s", patient.name, patient.email, patient.birthDate);
          //alerta: falta fazer o login pra tela de quem acabou de cadastrar
          
        } else System.out.println("Tente novamente.");
        break;
      default:
        System.out.println("Código inválido! Reenvie.");
        break;
    }

  }
}
