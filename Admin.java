import java.util.ArrayList;
import java.util.HashMap;

public class Admin {
  
    private String[][] doctorsAccounts = { { "mariana.mendes@medicals.com", "mari@458"}, {"pietra.freitas@medicals.com", "91frei@!"}, {"wemilly.souza@medicals.com", "ue54!mi"}, {"rebeca.queiroz@medicals.com", "b48@qu"},{"hicaro.silva@medicals.com", "lov#47@"}, {"pedro.carvalho@medicals.com", "p3p3u@2013"} };
    private HashMap<String, Doctor> loginDoctor = new HashMap<>();
    
   
    private  ArrayList<ArrayList<String>> patientsAccounts = new ArrayList<>();
    private HashMap<String, Patients> loginPatients = new HashMap<>();


    public Doctor authDoctor(Credentials credentials) {
        for(String[] doctor : doctorsAccounts) {
            if(credentials.email.equals(doctor[0]) && credentials.password.equals(doctor[1])) {
                return loginDoctor.get(credentials.email);
            }
        }
        return null;
    }

    public Patients authPatient(Credentials credentials) {
      for(ArrayList<String> patient : patientsAccounts) {
          if(credentials.email.equals(patient.get(0)) && credentials.password.equals(patient.get(1))) {
              return loginPatients.get(credentials.email);
          }
      }
      return null;
  }

  public void addPatients(Patients patient){
      ArrayList<String> patients = new ArrayList<>();
      patients.add(patient.getEmail());
      patients.add(patient.getPassword());

      patientsAccounts.add(patients);

      loginPatients.put(patient.getEmail(), patient);
  
  }

  //nome, email, esp, lista vazia
  void AddDoctors(){
    loginDoctor.put("mariana.mendes@medicals.com", new Doctor("Mariana Mendes", "mariana.mendes@medicals.com","Dentista"));
    loginDoctor.put("pietra.freitas@medicals.com", new Doctor("Pietra Freitas","pietra.freitas@medicals.com","Ginecologista" ));
    loginDoctor.put("wemilly.souza@medicals.com", new Doctor("Wemilly Souza","wemilly.souza@medicals.com","Dermatologista"));
    loginDoctor.put("rebeca.queiroz@medicals.com", new Doctor("Rebeca Queiroz","rebeca.queiroz@medicals.com","Nutricionista"));
    loginDoctor.put("hicaro.silva@medicals.com", new Doctor("Hicaro Silva","hicaro.silva@med", "Proctologista"));
    loginDoctor.put("pedro.carvalho@medicals.com", new Doctor("Pedro Carvalho", "pedro.carvalho@medicals.com", "Clínico Geral"));

  }

  void AddDummyPatients(){

    ArrayList<String> patients1 = new ArrayList<>();
    ArrayList<String> patients2 = new ArrayList<>();

    loginPatients.put("johab.manoel@patients.com", new Patients("Johab Manoel", "johab.manoel@patients.com", "07/07/1887", "j0h4b"));
    loginPatients.put("selena.gomez@patients.com", new Patients("Selena Gomez", "selena.gomez@patients.com", "22/07/1992", "amoofaustao"));

    //primeiro adiciona na lita
    patients1.add("johab.manoel@patients.com");
    patients1.add("j0h4b");

    patients2.add("selena.gomez@patients.com");
    patients2.add("amoofaustao");

    //depois adiciona na tabela hash
    patientsAccounts.add(patients1);
    patientsAccounts.add(patients2);

  }
  
}

  


