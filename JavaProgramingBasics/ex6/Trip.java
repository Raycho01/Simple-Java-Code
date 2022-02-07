package ex6;

import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double spent_money = 0;
        double money_left = 0;
        String place_to_sleep = " ";
        String place = " ";

        if(budget <= 100){
            if(season.equals("summer")){
                spent_money = budget * 0.3;
                money_left = budget - spent_money;
            }
            else if(season.equals("winter")){
                spent_money = budget * 0.7;
                money_left = budget - spent_money;
            }
            place = "Bulgaria";
        }
        else if(budget > 100 && budget <= 1000){
            if(season.equals("summer")){
                spent_money = budget * 0.4;
                money_left = budget - spent_money;
            }
            else if(season.equals("winter")){
                spent_money = budget * 0.8;
                money_left = budget - spent_money;
            }
            place = "Balkans";
        }
        else{
            spent_money = budget * 0.9;
            money_left = budget - spent_money;
            place = "Europe";
        }

        if(season.equals("winter") || place.equals("Europe")){
            place_to_sleep = "Hotel";
        }
        else{
            place_to_sleep = "Camp";
        }

        System.out.printf("Somewhere in %s \n%s - %.2f", place, place_to_sleep, spent_money);

    }
}
