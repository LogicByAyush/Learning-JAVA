import java.util.Scanner;
public class Marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of students: ");
        n = sc.nextInt();
        int [] marks = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Enter the marks of student " + (i+1) + ": ");
            marks[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++)
            System.out.println("Marks of student " + (i+1) + ": " + marks[i]);
        sc.close();
    }
}
