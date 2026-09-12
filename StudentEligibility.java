import java.util.Scanner;
class StudentEligibility{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        boolean stu, id;
        System.out.println("Enter age: ");
        age = sc.nextInt();
        System.out.println("Are you a student? ");
        stu = sc.nextBoolean();
        System.out.println("Do you have ID? ");
        id = sc.nextBoolean();
        if(age < 0)
            System.out.println("Invalid age");
        else if(age >= 18 && stu && id)
            System.out.println("Eligible for program");
        else
            System.out.println("Not eligible for program");
        sc.close();
    }
}