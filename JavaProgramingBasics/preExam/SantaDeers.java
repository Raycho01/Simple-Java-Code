package preExam;

import java.util.Scanner;

public class SantaDeers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysGone = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());
        double firstDeer = Double.parseDouble(scanner.nextLine());
        double secondDeer = Double.parseDouble(scanner.nextLine());
        double thirdDeer = Double.parseDouble(scanner.nextLine());

        double consume = (firstDeer + secondDeer + thirdDeer) * daysGone;

        if (food >= consume){

            food -= consume;
            food = Math.floor(food);
            System.out.printf("%.0f kilos of food left.", food);

        }
        else {

            consume -= food;
            consume = Math.ceil(consume);
            System.out.printf("%.0f more kilos of food are needed.", consume);

        }

    }
}
