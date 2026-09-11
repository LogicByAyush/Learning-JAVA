import java.util.Scanner;
class NumberRange{
    static void main(String[] args){
        int number;
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter the number: ");
        number = sc.nextInt();
        if (number >= 10 && number <= 50)
            System.out.println("Number is in range");
        else
            System.out.println("Number is out of range");
        sc.close();
    }
}