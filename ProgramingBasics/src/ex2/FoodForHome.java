package ex2;

import java.util.Scanner;

public class FoodForHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double chicken = Double.parseDouble(scanner.nextLine()) * 10.35;
        double fish = Double.parseDouble(scanner.nextLine()) * 12.40;
        double veg = Double.parseDouble(scanner.nextLine()) * 8.15;

        double money = chicken + fish + veg;
        money = money + (money * 0.2) + 2.5;
        System.out.println(money);
    }
}
