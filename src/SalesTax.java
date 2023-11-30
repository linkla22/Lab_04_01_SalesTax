import java.util.Scanner;
public class SalesTax {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your purchase price: ");
        int purchasePrice = sc.nextInt();
        double salesTax = purchasePrice * 0.05;
        System.out.println("The original price was : " + purchasePrice);
        System.out.println("The sales tax is : " + salesTax);

    }
}

