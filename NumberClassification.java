import java.util.Scanner;
class NumberClassification{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter the number: ");
        number = sc.nextInt();
        if(number>0){
            if(number%2==0)
                System.out.println("Positive and even number");
            else
                System.out.println("Positive and odd number");
        }
        else if(number<0){
            if(number%2==0)
                System.out.println("Negative and even number");
            else
                System.out.println("Negative and odd number");
        }
        else
            System.out.println("The number is zero");
        sc.close();
    }
}