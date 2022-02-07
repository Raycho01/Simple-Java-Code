package ex7;

import java.util.Scanner;

public class StepensOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int step = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= step; i+=2){
            System.out.printf("%.0f \n", Math.pow(2, i));
        }
    }
}
