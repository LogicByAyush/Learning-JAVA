import java.util.Scanner;
public class DivisibleCheck{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Enter the number: ");
    num = sc.nextInt();
    if(num%5 == 0 || num%7 == 0)
        System.out.println("Divisible by 5 or 7");
    else
        System.out.println("Not Divisible by 5 or 7");
    sc.close();
    }
}