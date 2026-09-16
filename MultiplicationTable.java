import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String[] args){
        int num, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        num = sc.nextInt();
        for (i=1; i<=10; i++)
            System.out.println(num + " x " + i + " = " + (num*i));
        sc.close();
    }
}