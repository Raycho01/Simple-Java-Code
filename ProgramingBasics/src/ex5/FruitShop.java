package ex5;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double banana = 0;
        double apple = 0;
        double orange = 0;
        double grapefruit = 0;
        double kiwi = 0;
        double pineapple = 0;
        double grapes = 0;
        double price = 0;

        if(day.equals("Saturday") || day.equals("Sunday")){
            banana = 2.7;
            apple = 1.25;
            orange = 0.9;
            grapefruit = 1.6;
            kiwi = 3;
            pineapple = 5.6;
            grapes = 4.2;

            switch (fruit){
                case "banana":
                    price = quantity * banana;
                    System.out.printf("%.2f", price);
                    break;
                case "apple":
                    price = quantity * apple;
                    System.out.printf("%.2f", price);
                    break;
                case "orange":
                    price = quantity * orange;
                    System.out.printf("%.2f", price);
                    break;
                case "grapefruit":
                    price = quantity * grapefruit;
                    System.out.printf("%.2f", price);
                    break;
                case "kiwi":
                    price = quantity * kiwi;
                    System.out.printf("%.2f", price);
                    break;
                case "pineapple":
                    price = quantity * pineapple;
                    System.out.printf("%.2f", price);
                    break;
                case "grapes":
                    price = quantity * grapes;
                    System.out.printf("%.2f", price);
                    break;
                default:
                    System.out.printf("error");
            }

        }
        else if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
            banana = 2.5;
            apple = 1.2;
            orange = 0.85;
            grapefruit = 1.45;
            kiwi = 2.7;
            pineapple = 5.5;
            grapes = 3.85;

            switch (fruit){
                case "banana":
                    price = quantity * banana;
                    System.out.printf("%.2f", price);
                    break;
                case "apple":
                    price = quantity * apple;
                    System.out.printf("%.2f", price);
                    break;
                case "orange":
                    price = quantity * orange;
                    System.out.printf("%.2f", price);
                    break;
                case "grapefruit":
                    price = quantity * grapefruit;
                    System.out.printf("%.2f", price);
                    break;
                case "kiwi":
                    price = quantity * kiwi;
                    System.out.printf("%.2f", price);
                    break;
                case "pineapple":
                    price = quantity * pineapple;
                    System.out.printf("%.2f", price);
                    break;
                case "grapes":
                    price = quantity * grapes;
                    System.out.printf("%.2f", price);
                    break;
                default:
                    System.out.printf("error");
            }
        }

        else {
            System.out.printf("error");
        }


    }
}
