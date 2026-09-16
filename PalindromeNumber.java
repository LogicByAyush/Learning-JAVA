import java.util.Scanner;
public class PalindromeNumber{
    public static void main(String args[]){
        int num, rev = 0, rem, s_num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for palindrome : ");
        num = sc.nextInt();
        s_num = num;
        while(num != 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        if(s_num == rev)
            System.out.println("The number " + s_num + " is a palindrome");
        else
            System.out.println("The number " + s_num + " is not a palindrome");
        sc.close();
    }
}