package ex4;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double bonus;

        if(number <= 100){
            bonus = 5;
        }
        else if(number > 100 && number <= 1000){
            bonus = number * 0.2;
        }
        else{
            bonus = number * 0.1;
        }

        if(number % 2 == 0){
            bonus = bonus + 1;
        }

        if(number % 10 == 5 || number % 100 == 5 || number % 1000 == 5 || number % 10000 == 5){
            bonus = bonus + 2;
        }

        System.out.printf("%.1f \n%.1f", bonus, bonus + number);
    }
}
