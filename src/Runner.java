import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Boards Of Lumber: ");
        int lumber = s.nextInt();
        System.out.println("Windows: ");
        int windows = s.nextInt();
        System.out.println("Tax Rate: ");
        double taxRate = s.nextDouble();

        ConstructionPricer house1 = new ConstructionPricer(11.50, 25.75 , taxRate);
        double cost = house1.materialsCost(lumber, windows);
        System.out.println("Material Cost: " + cost);
        double costWithTax = house1.totalWithTax(cost);
        System.out.println("Total Cost: " + costWithTax);

    }
}
