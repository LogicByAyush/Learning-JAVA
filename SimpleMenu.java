import java.util.Scanner;
public class SimpleMenu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Say Hello");
            System.out.println("2. Say Good morning");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("Good morning");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
        sc.close();
    }
}