import java.util.Scanner;
public class SumOfDigits{
    public static void main(String[] args){
        int num, sum_digit = 0, last_digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        num = sc.nextInt();
        while(num != 0){
            last_digit = num%10;
            sum_digit += last_digit;
            num /= 10;
        }
        System.out.println("Sum of the digit is " + sum_digit);
        sc.close();
    }
}