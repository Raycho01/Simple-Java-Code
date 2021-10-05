package ex2;

import java.util.Scanner;

public class BasketEquip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year_tax = Integer.parseInt(scanner.nextLine());
        double shoes = year_tax - (0.4 * year_tax);
        double costume = shoes - (0.2 * shoes);
        double ball = 0.25 * costume;
        double extras = 0.2 * ball;
        double money = year_tax + costume + shoes + ball + extras;
        System.out.println(money);
    }
}
