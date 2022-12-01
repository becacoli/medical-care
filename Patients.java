public class Patients {

  String name;
  String email;
  String birthDate;
  String password;


  public Patients(String name, String email, String birthDate, String password) {
    this.name = name;
    this.email = email;
    this.birthDate = birthDate;
    this.password = password;


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
    System.out.println("\nO que você deseja fazer?");
    System.out.println("1. Ver a lista de médicos");
    System.out.println("2. Dar feedback sobre a Medical Care");
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return String.format("Nome: %s \nE-mail: %s \nData de Nascimento: %s", name, email, birthDate);
  }
}