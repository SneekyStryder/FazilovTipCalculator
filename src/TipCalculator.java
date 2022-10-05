import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // User Input for Info
        System.out.print("Enter total bill: ");
        double totalBillCost = scan.nextDouble();
        System.out.print("Enter tip percentage: ");
        int tipPercentage = scan.nextInt();
        System.out.print("Enter number of people: ");
        int numPeople = scan.nextInt();

        // Variable Calculations
        double totalTip = (totalBillCost * tipPercentage) / 100;
        double totalBillTip = totalBillCost + totalTip;
        double tipPer = (double) Math.round((totalTip / numPeople) * 100) / 100;
        double costPer = (double) Math.round(((totalBillCost / numPeople) + tipPer) * 100) / 100;

        // Output with Calculated Values
        System.out.println("Tip Per Person: " + tipPer);
        System.out.println("Total Per Person: " + costPer);

    }
}
