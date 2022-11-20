public class Credentials {
    String email;
    String password;

    String name;
    String birthDate;

  public Credentials(String name, String email,  String birthDate, String password) {
      this.email = email;
      this.password = password;
      this.name = name;
      this.birthDate = birthDate;
    }

  // credenciais do doctor/patient
  public Credentials(String email, String password) {
    this.email = email;
    this.password = password;
  }

  
}
