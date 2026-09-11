import java.util.Scanner;
public class LoginCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String user_ID = "admin" , user_id;
        int password = 1234 , pass_word;
        System.out.println("Enter the User ID: ");
        user_id = sc.nextLine();
        System.out.println("Enter the Password: ");
        pass_word = sc.nextInt();
        if (user_id.equals(user_ID) && password == pass_word)
            System.out.println("Login successful");
        else
            System.out.println("Login unsuccessful");
        sc.close();
    }
}