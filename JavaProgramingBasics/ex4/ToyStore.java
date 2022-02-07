package ex4;

import java.util.Scanner;

public class ToyStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacation = Double.parseDouble(scanner.nextLine());
        double puzzle = Double.parseDouble(scanner.nextLine());
        double talking_doll = Double.parseDouble(scanner.nextLine());
        double teddy_bear = Double.parseDouble(scanner.nextLine());
        double minion = Double.parseDouble(scanner.nextLine());
        double truck = Double.parseDouble(scanner.nextLine());
        double counter;
        double money;

        counter = puzzle + talking_doll + teddy_bear + minion + truck;

        puzzle = puzzle * 2.6;
        talking_doll = talking_doll * 3;
        teddy_bear = teddy_bear * 4.1;
        minion = minion * 8.2;
        truck = truck * 2;

        money = puzzle + talking_doll + teddy_bear + minion + truck;

        if(counter >= 50){
            money = money - (money * 0.25);
        }


        money = money - (money * 0.1);

        if(money >= vacation){
            money = money - vacation;
            System.out.printf("Yes! %.2f lv left.", money);
        }
        else{
            money = vacation - money;
            System.out.printf("Not enough money! %.2f lv needed.", money);
        }
    }
}
