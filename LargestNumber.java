import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();
        if( num1> num2 )
            System.out.println("Largest among both is " + num1);
        else if( num1< num2 )
            System.out.println("Largest among both is " + num2);
        else
            System.out.println("Both are equal "); 
        sc.close();     
    }
}