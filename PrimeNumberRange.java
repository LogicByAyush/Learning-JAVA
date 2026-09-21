import java.util.Scanner;
public class PrimeNumberRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting and ending :");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("Prime number between " + start + " to " + end + " are ");
        for(int i=start; i<= end; i++){
            int count = 0;
            for(int j = 2; j < (i/2); j++){
                if(i%j == 0){
                    count++;
                    break;
                }
            }
            if(count == 0)
                System.out.print( i + " ");
        }
        sc.close();
    }
}