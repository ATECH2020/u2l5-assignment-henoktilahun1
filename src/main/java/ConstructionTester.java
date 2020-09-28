import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double lumberCost = 8;
        double windowCost = 11;
        double taxRate, total;
        int boards, windows;

        System.out.println("Enter the sales tax rate: ");
        taxRate = in.nextDouble();
        System.out.println("Enter how many boards you need");
        boards = in.nextInt();
        System.out.println("Enter how many windows you need");
        windows = in.nextInt();

        Construction c = new Construction(lumberCost, windowCost, taxRate);
        total = c.lumberCost(boards) + c.windowCost(windows);
        System.out.println("total: " + total);

        double grandTotal = total + taxRate;

        System.out.println("Grand total: " + c.grandTotal(total));

    }
}
