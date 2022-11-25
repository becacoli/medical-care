import java.util.ArrayList;

public class Patients {

  String name;
  String email;
  String birthDate;
  String password;

  private ArrayList<String> medicalReportsReceived;
  private String feedback;

  public Patients(String name, String email, String birthDate, String password) {
    this.name = name;
    this.email = email;
    this.birthDate = birthDate;
    this.password = password;

    this.medicalReportsReceived = new ArrayList<>();

  }

  public Patients() {
  }

  public String sendFeedback() {
    return feedback;
  }

  // TENTATIVA DE COMPOSIÇÃO
  public void AddMedicalReports(Doctor doctor) {
    medicalReportsReceived.add(doctor.sendMedicalReports());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void showOptions() {
    System.out.println("O que você deseja fazer?");
    System.out.println("1. Ver a lista de médicos");
    System.out.println("2. Dar feedback sobre a Medical Care");
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return String.format("Nome: %s \nE-mail: %s \nData de Nascimento: %s", name, email, birthDate);
  }
}