package MarchExamTest;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double tax = 0;

        if(gender.equals("m")){
            switch (sport){
                case "Gym":
                    tax = 42;
                    break;
                case "Bxoing":
                    tax = 41;
                    break;
                case "Yoga":
                    tax = 45;
                    break;
                case "Zumba":
                    tax = 34;
                    break;
                case "Dances":
                    tax = 51;
                    break;
                case "Pilates":
                    tax = 39;
                    break;
            }
        }
        else if(gender.equals("f")){
            switch (sport){
                case "Gym":
                    tax = 35;
                    break;
                case "Bxoing":
                    tax = 37;
                    break;
                case "Yoga":
                    tax = 42;
                    break;
                case "Zumba":
                    tax = 31;
                    break;
                case "Dances":
                    tax = 53;
                    break;
                case "Pilates":
                    tax = 37;
                    break;
            }
        }

        if(age <= 19){
            tax = tax - (tax * 0.20);
        }

        if(money >= tax){
            System.out.println("You purchased a 1 month pass for " + sport + ".");
        }
        else{
            money = tax - money;
            System.out.printf("You don't have enough money! You need $%.2f more.", money);
        }
    }
}
