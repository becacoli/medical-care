import java.util.ArrayList;
import java.util.Scanner;

public class Doctor {
  private String name;
  private String email;
  private String specialization;
  private ArrayList<String> feedbackReceived;

  private String medicalReports;

  public Doctor(String name, String email, String specialization) {
    this.name = name;
    this.email = email;
    this.specialization = specialization;
    this.feedbackReceived = new ArrayList<>();
  }

  // segundo construtor para criação do relatório médico
  public Doctor(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um texto:");
    medicalReports = sc.next();
    sc.close();
  }

  public void AddFeedbacks(Patients patient){
    feedbackReceived.add(patient.sendFeedback());
  }

  public ArrayList<String> getFeedbackReceived(){
    return feedbackReceived;
  }

  public String sendMedicalReports(){
    return medicalReports;
  }
}
