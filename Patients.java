import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Patients{

  private String name;
  private String email;
  private java.util.Date birthDate;

  
  private ArrayList<String> medicalReportsReceived;
  private ArrayList<String> appointmentScheduled;
  
  private String feedback;
  
  
  public Patients(String name, String email, Date birthDate) {
    this.name = name;
    this.email = email;
    this.birthDate = birthDate;
    
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

  public void setEmail(String email) {
    this.email = email;
  }

  public java.util.Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(java.util.Date birthDate) {
    this.birthDate = birthDate;
  }
}