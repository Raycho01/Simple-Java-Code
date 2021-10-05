package ex4;

import java.util.Scanner;

public class ShoppingPC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videocards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double money_videocards;
        double money_processors;
        double money_ram;
        double money;

        money_videocards = videocards * 250;

        money_processors = money_videocards * 0.35;
        money_processors = money_processors * processors;

        money_ram = money_videocards * 0.1;
        money_ram = money_ram * ram;

        money = money_processors + money_ram + money_videocards;

        if(videocards > processors){
            money = money - (money * 0.15);
        }

        if(budget >= money){
            budget = budget - money;
            System.out.printf("You have %.2f leva left!", budget);
        }
        else {
            budget = money - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", budget);
        }

    }
}
