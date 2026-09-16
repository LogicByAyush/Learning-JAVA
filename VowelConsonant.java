// VowelConsonant.java  
import java.util.Scanner;
public class VowelConsonant{
    public static void main(String[] args){
        char letter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter : ");
        letter = sc.next().charAt(0);
        if ( letter == 'a' ||  letter == 'e' ||  letter == 'i' ||  letter == 'o' ||  letter == 'u' ||  letter == 'A' ||  letter == 'E' ||  letter == 'I' ||  letter == 'O' ||  letter == 'U' )
            System.out.println("Vowel");
        else
            System.out.println("Consoant") ;
        sc.close();
    } 
}