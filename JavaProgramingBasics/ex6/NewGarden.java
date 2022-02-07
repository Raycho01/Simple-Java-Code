package ex6;

import java.text.DecimalFormat;
import java.util.Scanner;


public class NewGarden {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double price = 0;


        if(flowers.equals("Roses")){
            price = number * 5;
            if(number > 80){
                price = price - (price * 0.1);
            }
        }

        else if(flowers.equals("Dahlias")){
            price = number * 3.8;
            if(number > 90){
                price = price - (price * 0.15);
            }
        }

        else if(flowers.equals("Tulips")){
            price = number * 2.8;
            if(number > 80  ){
                price = price - (price * 0.15);
            }
        }

        else if(flowers.equals("Narcissus")){
            price = number * 3;
            if(number < 120){
                price = price + (price * 0.15);
            }
        }

        else if(flowers.equals("Gladiolus")){
            price = number * 2.5;
            if(number < 80){
                price = price + (price * 0.2);
            }
        }

        if(price <= budget){
            budget = budget - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flowers, budget);
        }
        else{
            budget = price - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", budget);
        }


    }
}
