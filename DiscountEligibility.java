import java.util.Scanner;
class DiscountEligibility{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age, purchaseAmount;
        boolean ismember;
        System.out.println("Age: ");
        age = sc.nextInt();
        System.out.println("Member: ");
        ismember= sc.nextBoolean();
        System.out.println("Purchase amount: ");
        purchaseAmount = sc.nextInt();
        if ( ( age >= 18 && ismember ) || purchaseAmount >= 1000 )
            System.out.println("Discount Available");
        else
            System.out.println("No Discount");
        sc.close();
    }
}