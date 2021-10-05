package ex8;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;

        for (int i = 0; i < n; i++){

            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200){
                p1++;
            }
            else if (number >= 200 && number <= 399){
                p2++;
            }
            else if (number >= 400 && number <= 599){
                p3++;
            }
            else if (number >= 600 && number <= 799){
                p4++;
            }
            else {
                p5++;
            }

        }

        p1 = p1 / n * 100;
        p2 = p2 / n * 100;
        p3 = p3 / n * 100;
        p4 = p4 / n * 100;
        p5 = p5 / n * 100;

        System.out.printf("%.2f%%\n", p1);
        System.out.printf("%.2f%%\n", p2);
        System.out.printf("%.2f%%\n", p3);
        System.out.printf("%.2f%%\n", p4);
        System.out.printf("%.2f%%\n", p5);

    }
}
