import java.util.Scanner;
public class ElementFrequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [] newarr = new int()

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        System.out.println("Enter "+ size + " elements of the array: ");

        for(int i=0; i<size; i++)
            arr[i] = sc.nextInt();
        
        for(int i=0; i<size; i++){
            int count = 0;
            for(int j=0; j<size; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i] + " is " + count + " times is array");
        }

        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i] != arr[j]){

                }
            }
        }

        sc.close();
    }
}
