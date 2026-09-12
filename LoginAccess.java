import java.util.Scanner;
public class LoginAccess {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Boolean isLoggedIn, isAdmin;
        System.out.println("Enter the login status (true/false): ");
        isLoggedIn = sc.nextBoolean();
        System.out.println("Enter the admin status (true/false): ");
        isAdmin = sc.nextBoolean();
        if(isLoggedIn && isAdmin){
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
        sc.close();
    }    
}