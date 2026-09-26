import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphibet: ");
        char ch = sc.next().charAt(0);

        int num = ch;

        System.out.print(num);

        sc.close();
    }
}