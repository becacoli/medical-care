import java.util.ArrayList;
import java.util.Scanner;

public class Patients{

  String name;
  String email;
  String birthDate;
  String password;
  
  private ArrayList<String> medicalReportsReceived;
  private ArrayList<String> appointmentScheduled;
  
  private String feedback;
  
  
  public Patients(String name, String email, String birthDate, String password) {
    this.name = name;
    this.email = email;
    this.birthDate = birthDate;
    this.password = password;
    
    this.medicalReportsReceived = new ArrayList<>();
    
  }

  public Patients(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um texto:");
    feedback = sc.next();
    sc.close();
  }
  
  
  public String sendFeedback() {
    return feedback;
  }
  
  // TENTATIVA DE COMPOSIÇÃO
  public void AddMedicalReports(Doctor doctor){
    medicalReportsReceived.add(doctor.sendMedicalReports());
  }
  
  public void MarcarConsulta(Doctor doctor){
    
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

  public String getPassword(){
    return password;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}