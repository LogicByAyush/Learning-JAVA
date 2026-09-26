import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int [] arr = new int [size];

        for(int i=0; i<size; i++){
            System.out.print("Enter the "+ (i+1) + " element of array: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nYou entered array is following.");

        for(int i=0; i<size; i++)
            System.out.print(arr[i] + "\t");

        sc.close();
    }
}