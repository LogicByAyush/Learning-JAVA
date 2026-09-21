import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0, num;
        System.out.print("Enter the number : ");
        num = sc.nextInt();
        for(int i= 2; i<num/2; i++)
            if(num % i == 0){
                count++;
                break;
            }
        if(count == 0)
            System.out.print(num + " is a prime number");
        else
            System.out.print(num + " is not a prime number");
        sc.close();
    }
}