import java.util.Scanner;
public class WeekendCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter the number: ");
        number = sc.nextInt();
        if (number == 6 || number ==7)
            System.out.println("Weekend");
        else
            System.out.println("Weekday");
        sc.close();
    }
}