import java.util.Scanner;
public class RetailPrice {
    public static void main(String[] args) {
        String cont;
        double cost, retail, rate;

        Scanner keybd = new Scanner(System.in);

        do {
            cont = "Y";
            System.out.println("Would you like to calculate a retail price (Y/N)?");
            cont = keybd.next();

            if (!(cont.equals("N"))) {
                System.out.println("Enter a rate value");
                rate = keybd.nextDouble();
                System.out.println("Enter the cost of the product");
                cost = keybd.nextDouble();
                retail = cost * rate;
                System.out.println("The retail price of this item is: " + retail);
            } else
                continue;
        } while (!(cont.equals("N")));
    }
}
