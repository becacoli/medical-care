import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Admin admin = Admin.getInstance();
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

        // login doctor
        System.out.println("Olá novamente \n \nDigite seu usuário: ");

        String userDoctor = sc.next();
        System.out.print("Digite sua senha:\n ");
        // System.out.println();
        String passwordDoctor = sc.next();

        Credentials userDoctorCredential = new Credentials(userDoctor, passwordDoctor);
        Doctor doctor = admin.authDoctor(userDoctorCredential);

        if (doctor != null) {
          System.out.printf("|Seus dados: \n|Nome: %s \n|E-mail: %s\n|Especialização: %s", doctor.name, doctor.email,
              doctor.specialization);
          doctor.showOptions();
          Integer respOp = sc.nextInt();
          if (respOp == 1) {
            ArrayList<Patients> patients = new ArrayList<>(admin.getLoginPatients().values());
            Integer cont = 0;
            for (Patients currentPatients : patients) {
              cont += 1;

              System.out.println("----------------------------------");
              System.out.printf("%s - %s\n", cont, currentPatients);
              System.out.println("----------------------------------");

            }

          }
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

        if (resp == 1) {

          // login paciente
          System.out.println("Olá novamente \n \nDigite seu usuário: ");

          String user = sc.next();
          System.out.print("Digite sua senha:\n ");
          // System.out.println();
          String password = sc.next();

          Credentials userCredential = new Credentials(user, password);
          Patients patient = admin.authPatient(userCredential);

          if (patient == null) {
            System.out.println("É nulo");

            return;

          }

          System.out.printf("|Seus dados: \n|Nome: %s \n|E-mail: %s\n|Data de nascimento: %s", patient.name,
              patient.email, patient.birthDate);

          patient.showOptions();
          // resp = 1;

          Integer respOp = sc.nextInt();
          // System.out.println(resp);
          switch (respOp) {
            case 1:
              ArrayList<Doctor> doctors = new ArrayList<>(admin.getLoginDoctor().values());
              Integer cont = 0;
              for (Doctor currentDoctor : doctors) {
                cont += 1;

                System.out.println("----------------------------------");
                System.out.printf("%s - %s\n", cont, currentDoctor);
                System.out.println("----------------------------------");

              }

              System.out.println("Deseja marcar uma consulta? \n1. Sim\n2. Não");
              Integer respCon = sc.nextInt();
              if (respCon == 1) {
                System.out.println("Com qual médico você gostaria de se consultar? Digite o número do médico da lista");
                Integer respChooseDoctor = sc.nextInt();
                respChooseDoctor -= 1;
                Doctor selectedDoctor = doctors.get(respChooseDoctor);
                System.out.printf("Você marcou uma consulta com o médico(a) %s\n", selectedDoctor.name);
                System.out.println("Como você gostaria de pagar?");
                System.out.println("1. PIX\n2. Cartão de Crédito");
                Integer selectedPaymentMethod = sc.nextInt();
                if (selectedPaymentMethod == 1) {
                  Pix pix = new Pix();
                  pix.pay();
                } else if (selectedPaymentMethod == 2) {
                  CreditCard creditCard = new CreditCard();
                  creditCard.pay();
                } else {
                  System.out.println("Método de pagamento não disponível.");
                  return;
                }

                System.out.println("Obrigada por ter marcado sua consulta com a Medical Care.");

              } else if (respCon == 2) {
                System.out.println("Volte sempre para a Medical Care");
              } else {
                return;
              }

              break;
            case 2:
              System.out.println("Dê seu feedback sobre a nossa clínica");
              String feedback = sc.next();
              System.out.println("Obrigado pelo seu feedback!");
            default:
              break;
          }

        } else if (resp == 2) {
          // cadastro do paciente
          Credentials patientRegistration = RegisterPatients.signIn();
          Patients patient = new Patients(patientRegistration.name, patientRegistration.email,
              patientRegistration.birthDate, patientRegistration.password);
          admin.addPatients(patient);
          System.out.printf("|Seus dados: \n|Nome: %s \n|E-mail: %s\n|Data de nascimento: %s", patient.name,
              patient.email, patient.birthDate);
          // alerta: falta fazer o login pra tela de quem acabou de cadastrar
          patient.showOptions();
          // resp = 1;

          Integer respOp = sc.nextInt();
          // System.out.println(resp);
          switch (respOp) {
            case 1:
              ArrayList<Doctor> doctors = new ArrayList<>(admin.getLoginDoctor().values());
              Integer cont = 0;
              for (Doctor currenDoctor : doctors) {
                cont += 1;

                System.out.println("----------------------------------");
                System.out.printf("%s - %s\n", cont, currenDoctor);
                System.out.println("----------------------------------");

              }

              System.out.println("Deseja marcar uma consulta? \n1. Sim\n2. Não");
              Integer respCon = sc.nextInt();
              if (respCon == 1) {
                System.out.println("Com qual médico você gostaria de se consultar? Digite o número do médico da lista");
                Integer respChooseDoctor = sc.nextInt();
                respChooseDoctor -= 1;
                Doctor selectedDoctor = doctors.get(respChooseDoctor);
                System.out.printf("Você marcou uma consulta com o médico(a) %s\n", selectedDoctor.name);
                System.out.println("Como você gostaria de pagar?");
                System.out.println("1. PIX\n2. Cartão de Crédito");
                Integer selectedPaymentMethod = sc.nextInt();
                if (selectedPaymentMethod == 1) {
                  Pix pix = new Pix();
                  pix.pay();
                } else if (selectedPaymentMethod == 2) {
                  CreditCard creditCard = new CreditCard();
                  creditCard.pay();
                } else {
                  System.out.println("Método de pagamento não disponível.");
                  return;
                }

                System.out.println("Obrigada por ter marcado sua consulta com a Medical Care.");

              } else if (respCon == 2) {
                System.out.println("Volte sempre para a Medical Care");
              } else {
                return;
              }

              break;
            case 2:
              System.out.println("Dê seu feedback sobre a nossa clínica");
              String feedback = sc.next();
              System.out.println("Obrigado pelo seu feedback!");
            default:
              break;
          }
        } else
          System.out.println("Tente novamente.");
        break;
      default:
        System.out.println("Código inválido! Reenvie.");
        break;
    }

  }
}
