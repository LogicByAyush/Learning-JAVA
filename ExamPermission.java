import java.util.Scanner;
class ExamPermission{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int age;
    boolean isStudent, hasAdmitCard;
    
    System.out.println("Enter your age : ");
    age = sc.nextInt();
    System.out.println("Student (True/False) : ");
    isStudent = sc.nextBoolean();
    System.out.println("Admit Card (True/False) : ");
    hasAdmitCard = sc.nextBoolean();

    if(!(age < 18 || !isStudent || !hasAdmitCard))
      System.out.println("Exam Permission Granted");
    else
      System.out.println("Exam Permission Denied");
    
    sc.close();
  }
}
