package ex8;

import java.util.Scanner;

public class SmartLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washerPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double money = 0;
        int toys = 0;
        int giftMoney = 0;

        for (int i = 1; i <= age; i++){

            if (i % 2 == 0){
                giftMoney += 10;
                money += giftMoney;
                money--;
            }
            else {
                toys++;
            }

        }

        toys = toys * toyPrice;
        money = money + toys;

        if (money >= washerPrice){

            System.out.printf("Yes! %.2f", money - washerPrice);

        }
        else {

            System.out.printf("No! %.2f", washerPrice - money);

        }

    }
}
