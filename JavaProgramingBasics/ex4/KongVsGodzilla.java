package ex4;

import java.util.Scanner;

public class KongVsGodzilla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int men = Integer.parseInt(scanner.nextLine());
        double price_for_men = Double.parseDouble(scanner.nextLine());
        double money_for_men;
        double money;

        money_for_men = men * price_for_men;

        if(men > 150){
            money_for_men = money_for_men - (money_for_men * 0.1);
        }

        money = money_for_men + (budget * 0.1);

        if(budget >= money){
            budget = budget - money;
            System.out.printf("Action! \nWingard starts filming with %.2f leva left.", budget);
        }
        else {
            budget = money - budget;
            System.out.printf("Not enough money! \nWingard needs %.2f leva more.", budget);
        }

    }
}
