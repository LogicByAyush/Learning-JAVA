import java.util.Scanner;
public class ReverseNumber{
    public static void main(String args[]){
        int num, rev = 0, rem, s_num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse : ");
        num = sc.nextInt();
        s_num = num;
        while(num != 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        System.out.println("The reverse of the number " + s_num + " is " + rev);
        sc.close();
    }
}