package BasicSyntaxLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        for (int i = 0; i < n; i ++) {
            double priceCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsule = Integer.parseInt(scanner.nextLine());

            double price = (countCapsule * days) * priceCapsule;
            System.out.printf("The price for the coffee is: $%.2f\n", price);
            sum += price;
        }

        System.out.printf("Total: $%.2f", sum);
    }
}
