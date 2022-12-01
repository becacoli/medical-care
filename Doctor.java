
public class Doctor {
  String name;
  String email;
  String specialization;


  public Doctor(String name, String email, String specialization) {
    this.name = name;
    this.email = email;
    this.specialization = specialization;
    
  }

  public void showOptions() {
    System.out.println("\nO que você deseja fazer?");
    System.out.println("1. Ver a lista de pacientes");
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return String.format("Nome: %s \nE-mail: %s \nEspecialização: %s", name, email, specialization);
  }
}
