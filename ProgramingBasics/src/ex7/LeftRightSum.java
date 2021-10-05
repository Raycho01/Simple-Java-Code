package ex7;

import java.util.Scanner;

public class LeftRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++){
            int numb = Integer.parseInt(scanner.nextLine());
            sum1 += numb;
        }

        for (int i = 0; i < n; i++){
            int numb = Integer.parseInt(scanner.nextLine());
            sum2 += numb;
        }

        if (sum1 > sum2){
            System.out.printf("No, diff = %d", sum1 - sum2);
        }
        else if (sum2 > sum1){
            System.out.printf("No, diff = %d", sum2 - sum1);
        }
        else {
            System.out.printf("Yes, sum = %d", sum1);
        }
    }
}
