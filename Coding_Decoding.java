import java.util.Scanner;
public class Coding_Decoding {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the the word to code ");
        String code = sc.nextLine();
        int size = code.length();
        
        for(int i=0; i<size; i++){
            char ch = code[i];
            System.out.print(ch + "_");
        }

        sc.close();
    }
}
