package ex2;

import java.util.Scanner;

public class SuppliesSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pens = Double.parseDouble(scanner.nextLine()) * 5.8;
        double markers = Double.parseDouble(scanner.nextLine()) * 7.2;
        double cleaner = Double.parseDouble(scanner.nextLine()) * 1.2;
        double discount = Double.parseDouble(scanner.nextLine()) / 100;
        double money = pens + markers + cleaner;
        money = money - (money * discount);
        System.out.println(money);
    }
}
