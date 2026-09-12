import java.util.Scanner;
class NotOperator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Boolean value;
        System.out.println("Enter the Boolean value : ");
        value = sc.nextBoolean();
        System.out.println("The value is " + !value);
        sc.close();
    }
}