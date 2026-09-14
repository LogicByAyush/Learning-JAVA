import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        int i,num, fact = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find the factorial : ");
        num = sc.nextInt();
        for(i =1; i <= num; i++){
            fact = fact * i;
        }
        if(num < 0)
            System.out.println("The negative number does not have factorial.\nEnter another number.");
        else
            System.out.println("The factorial of the number " + num + " is " + fact);
        sc.close();
    }
}
