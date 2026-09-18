import java.util.Scanner;
public class CountDivisibleByThree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num,count = 0,i=1;
        System.out.println("Enter number: ");
        num = sc.nextInt();
        while(num >= i){
            if (i % 3 == 0)
                count++;
            i++;
        }
        System.out.println("Numbers divisible by 3: " + count);
        sc.close();
    }
}