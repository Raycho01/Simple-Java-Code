package ex8;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        double g1 = 0, g2 = 0, g3 = 0, g4 = 0, g5 = 0;
        int peopleSum = 0;

        for (int i = 0; i < groups; i++){

            int peopleInGroup = Integer.parseInt(scanner.nextLine());

            if (peopleInGroup <= 5){
                g1 += peopleInGroup;
            }
            else if (peopleInGroup >= 6 && peopleInGroup <= 12){
                g2 += peopleInGroup;
            }
            else if (peopleInGroup >= 13 && peopleInGroup <= 25){
                g3 += peopleInGroup;
            }
            else if (peopleInGroup >= 26 && peopleInGroup <= 40){
                g4 += peopleInGroup;
            }
            else {
                g5 += peopleInGroup;
            }

            peopleSum += peopleInGroup;

        }

        double p1, p2, p3, p4, p5;

        p1 = g1 / peopleSum * 100;
        p2 = g2 / peopleSum * 100;
        p3 = g3 / peopleSum * 100;
        p4 = g4 / peopleSum * 100;
        p5 = g5 / peopleSum * 100;

        System.out.printf("%.2f%%\n", p1);
        System.out.printf("%.2f%%\n", p2);
        System.out.printf("%.2f%%\n", p3);
        System.out.printf("%.2f%%\n", p4);
        System.out.printf("%.2f%%\n", p5);


    }
}
