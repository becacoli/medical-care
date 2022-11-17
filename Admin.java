import java.util.HashMap;

public class Admin {
  HashMap<Credentials, Doctor> loginDoctor = new HashMap<>();

  public HashMap<Credentials, Doctor> getLoginDoctor() {
      return loginDoctor;
    }

  //nome, email, esp, lista vazia
  void AddDoctors(){
    loginDoctor.put(new Credentials("mariana.mendes@medicals.com", "mari@458"), new Doctor("Mariana Mendes", "mariana.mendes@medicals.com","Dentista"));
    loginDoctor.put(new Credentials("pietra.freitas@medicals.com", "91frei@!"), new Doctor("Pietra Freitas","pietra.freitas@medicals.com","Ginecologista" ));
    loginDoctor.put(new Credentials("wemilly.souza@medicals.com", "ue54!mi"), new Doctor("Wemilly Souza","wemilly.souza@medicals.com","Dermatologista"));
    loginDoctor.put(new Credentials("rebeca.queiroz@medicals.com", "b48@qu"), new Doctor("Rebeca Queiroz","rebeca.queiroz@medicals.com","Nutricionista"));
    loginDoctor.put(new Credentials("hicaro.silva@medicals.com", "lov#47@"), new Doctor("Hicaro Silva","hicaro.silva@med", "Proctologista"));
    loginDoctor.put(new Credentials("pedro.carvalho@medicals.com", "p3p3u@2013"), new Doctor("Pedro Carvalho", "pedro.carvalho@medicals.com", "Clínico Geral"));

  }
}

  


