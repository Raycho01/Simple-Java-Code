package ex2;

import java.util.Scanner;

public class PaintingMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nylon = Double.parseDouble(scanner.nextLine()) * 1.5;
        nylon = nylon + 3;
        double paint = Double.parseDouble(scanner.nextLine()) * 14.5;
        paint = paint + (0.10 * paint);
        double thinner = Double.parseDouble(scanner.nextLine()) * 5;
        double hours = Double.parseDouble(scanner.nextLine());

        double money = nylon + paint + thinner + 0.4;

        double money_for_work = (money * 30/100) * hours;

        money = money + money_for_work;

        System.out.println(money);


    }
}
