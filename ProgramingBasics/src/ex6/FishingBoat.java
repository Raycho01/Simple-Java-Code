package ex6;

import java.util.Scanner;

public class FishingBoat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (season){
            case "Spring":
                price = 3000;
                if(people <= 6){
                    price = price - (price * 0.1);
                }
                else if(people >= 7 && people <= 11){
                    price = price - (price * 0.15);
                }
                else if(people > 11){
                    price = price - (price * 0.25);
                }
                if(people % 2 == 0){
                    price = price - (price * 0.05);
                }
                break;
            case "Summer":
                price = 4200;
                if(people <= 6){
                    price = price - (price * 0.1);
                }
                else if(people >= 7 && people <= 11){
                    price = price - (price * 0.15);
                }
                else if(people > 11){
                    price = price - (price * 0.25);
                }
                if(people % 2 == 0){
                    price = price - (price * 0.05);
                }
                break;
            case "Autumn":
                price = 4200;
                if(people <= 6){
                    price = price - (price * 0.1);
                }
                else if(people >= 7 && people <= 11){
                    price = price - (price * 0.15);
                }
                else if(people > 11){
                    price = price - (price * 0.25);
                }
                break;
            case "Winter":
                price = 2600;
                if(people <= 6){
                    price = price - (price * 0.1);
                }
                else if(people >= 7 && people <= 11){
                    price = price - (price * 0.15);
                }
                else if(people > 11){
                    price = price - (price * 0.25);
                }
                if(people % 2 == 0){
                    price = price - (price * 0.05);
                }
                break;
        }

        if(budget >= price){
            budget = budget - price;
            System.out.printf("Yes! You have %.2f leva left.", budget);

        }
        else{
            budget = price - budget;
            System.out.printf("Not enough money! You need %.2f leva.", budget);
        }
    }
}
