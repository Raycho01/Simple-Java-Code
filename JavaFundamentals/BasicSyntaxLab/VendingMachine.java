package BasicSyntaxLab;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double money = 0;
        double nuts = 2;
        double water = 0.7;
        double crisps = 1.5;
        double soda = 0.8;
        double coke = 1;

        while (!(input.equals("Start"))) {
            double moneyInput = Double.parseDouble(input);
            if (moneyInput == 0.1 || moneyInput == 0.2 || moneyInput == 0.5 || moneyInput == 1 || moneyInput == 2) {
                money += moneyInput;
            }
            else {
                System.out.printf("Cannot accept %.2f\n", moneyInput);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!(input.equals("End"))) {
            if (input.equals("Nuts")) {
                if (money >= nuts) {
                    money -= nuts;
                    System.out.println("Purchased Nuts");
                }
                else {
                    System.out.println("Sorry, not enough money");
                }
            }
            else if (input.equals("Water")) {
                if (money >= water) {
                    money -= water;
                    System.out.println("Purchased Water");
                }
                else {
                    System.out.println("Sorry, not enough money");
                }
            }
            else if (input.equals("Crisps")) {
                if (money >= crisps) {
                    money -= crisps;
                    System.out.println("Purchased Crisps");
                }
                else {
                    System.out.println("Sorry, not enough money");
                }
            }
            else if (input.equals("Soda")) {
                if (money >= soda) {
                    money -= soda;
                    System.out.println("Purchased Soda");
                }
                else {
                    System.out.println("Sorry, not enough money");
                }
            }
            else if (input.equals("Coke")) {
                if (money >= coke) {
                    money -= coke;
                    System.out.println("Purchased Coke");
                }
                else {
                    System.out.println("Sorry, not enough money");
                }
            }
            else {
                System.out.println("Invalid product");
            }
            if (money == 0) {
                break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", money);
    }
}
