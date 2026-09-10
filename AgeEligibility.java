import java.util.Scanner;
public class AgeEligibility{
    public static void main(String[] args){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        if (age>= 18 && age<60)
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");
        sc.close();
    }
}