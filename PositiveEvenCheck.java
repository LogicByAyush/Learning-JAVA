import java.util.Scanner;
class PositiveEvenCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        if(num > 0 && num%2==0)
            System.out.println("Positive and even");
        else
            System.out.println("Not positive and even");
        sc.close();
    }
}