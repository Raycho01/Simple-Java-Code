package BasicSyntaxLab;

import java.util.Scanner;

public class TheatreTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeDay = scanner.nextLine();
        int age = scanner.nextInt();

        int price = 0;

        if (typeDay.equals("Weekday")) {
            if (age > 0 && age <= 18) {
                price = 12;
            }
            else if (age > 18 && age <= 64) {
                price = 18;
            }
            else if (age > 64 && age <= 122) {
                price = 12;
            }
        }
        else if (typeDay.equals("Weekend")) {
            if (age > 0 && age <= 18) {
                price = 15;
            }
            else if (age > 18 && age <= 64) {
                price = 20;
            }
            else if (age > 64 && age <= 122) {
                price = 15;
            }
        }
        else {
            if (age > 0 && age <= 18) {
                price = 5;
            }
            else if (age > 18 && age <= 64) {
                price = 12;
            }
            else if (age > 64 && age <= 122) {
                price = 10;
            }
        }

     if (price > 0) {
         System.out.println(price + "$");
     }
     else {
         System.out.println("Error!");
     }
    }
}
