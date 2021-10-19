package ex11;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "0";
        String destination = scanner.nextLine();
        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double money = 0;

        while (!(input.equals("End"))){

            money = Double.parseDouble(input);
            moneyNeeded -= money;

            if (moneyNeeded<=0){
                System.out.println("Going to " + destination + "!");
                destination = scanner.nextLine();
                if (destination.equals("End")){
                    break;
                }
                moneyNeeded = Double.parseDouble(scanner.nextLine());
            }

            input = scanner.nextLine();


        }

    }
}
