import java.util.Scanner;
public class CountDigits{
    public static void main(String[] args){
        int count = 0, num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num == 0)
            System.out.println("The number is having 1 digit");
        else{
            while(num != 0){
                count += 1;
                num /= 10;
            }
            System.out.println("The number is having " + count + " digits");
        }
        sc.close();
    }
}