package ex5;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double coffee = 0;
        double water = 0;
        double beer = 0;
        double sweets = 0;
        double peanuts = 0;
        double price;

        if(city.equals("Sofia")){
            coffee = 0.5;
            water = 0.8;
            beer = 1.2;
            sweets = 1.45;
            peanuts = 1.6;
        }
        else if(city.equals("Plovdiv")){
            coffee = 0.4;
            water = 0.7;
            beer = 1.15;
            sweets = 1.3;
            peanuts = 1.5;
        }
        else {
            coffee = 0.45;
            water = 0.7;
            beer = 1.1;
            sweets = 1.35;
            peanuts = 1.55;
        }

        switch (product){
            case "coffee":
                coffee = quantity * coffee;
                System.out.printf("%.4f", coffee);
                break;
            case "water":
                water = quantity * water;
                System.out.printf("%.4f", water);
                break;
            case "beer":
                beer = quantity * beer;
                System.out.printf("%.4f", beer);
                break;
            case "sweets":
                sweets = quantity * sweets;
                System.out.printf("%.4f", sweets);
                break;
            case "peanuts":
                peanuts = quantity * peanuts;
                System.out.printf("%.4f", peanuts);
                break;
        }
    }
}
