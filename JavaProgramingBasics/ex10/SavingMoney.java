package ex10;

import java.util.Scanner;

public class SavingMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double balance = Double.parseDouble(scanner.nextLine());
        String action = scanner.nextLine();
        double money = Double.parseDouble(scanner.nextLine());

        int counter = 0;
        int spendCounter = 0;
        boolean isSaved = false;

        while (true){

            if (action.equals("spend")){
                spendCounter++;
                balance -= money;
                if (balance < 0){
                    balance = 0;
                }
                if (spendCounter == 5){
                    System.out.printf("You can't save the money.\n%d", spendCounter);
                    break;
                }
            }

            else {
                balance += money;
            }

            counter++;

            if (balance >= moneyNeeded){
                isSaved = true;
                break;
            }
            else {
                action = scanner.nextLine();
                money = Double.parseDouble(scanner.nextLine());
            }

        }

        if (isSaved){

            System.out.printf("You saved the money for %d days.", counter);

        }

    }
}
