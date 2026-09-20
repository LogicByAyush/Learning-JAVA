import java.util.Scanner;
public class PrimeNumberFrom-1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j,num,count = 0;
        System.out.print("Enter the range from 1 to : ");
        num = sc.nextInt();
        System.out.println("Prime numbers between 1 and " + num + " are: ");
        for(i = 1; i<= num; i++){
            count = 0;
            for(j=2; j<=i/2; j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count == 0 && i != 1)
                System.out.print(i + " ");
        }
        sc.close();
    }
}