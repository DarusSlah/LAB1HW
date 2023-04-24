import java.util.Scanner;

public class Cost {

//    Distance 0-4 = $2
//    Distance 5-15 = $5
//    Distance 16-25 = $10
//    Distance 26-50 = $15
//    Distance 51+ = $20
//
//    USE THE SCANNER CLASS AND STRING-FORMATTING TO WRITE A PROGRAM THAT ASK AND CALCULATES TOTAL COST OF USER'S ITEM.
//    YOUR OUTPUT SHOULD BE FORMATTED AS SEEN BELOW:
//
//
//    Product      Qty      Price       Miles      Total
//			----         ---      -----      -----      -----
//    Rice          20        5.0       10.0      105.0
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Product:");
        String product = scanner.nextLine();
        System.out.println("Quantity :");
        int quantity = scanner.nextInt();
        System.out.println("Put in the Price per item: ");
        double price = scanner.nextDouble();
        System.out.println("Enter your distance : ");
       double distance = scanner.nextInt();


       double rate;
        if (distance >= 0 && distance <= 4) {
            rate = 2;

        } else if (distance >= 5 && distance <= 15) {
            rate = 5;

        } else if (distance >= 16 && distance <= 25) {
             rate = 10;
        } else if (distance >= 26 && distance <= 50) {
             rate = 15;
        } else {
             rate = 20;
        }
        double totalCost = quantity * price + rate;

        System.out.println(" Product      Qty      Price       Miles      Total");
        System.out.println(" ----          ---       -----      -----      -----");
        System.out.printf("%-10s %7d %9.2f %10.1f %9.2f", product, quantity, price, distance, totalCost);
    }
}
