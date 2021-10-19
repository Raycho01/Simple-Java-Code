package ex9;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number = 0;
        int max = Integer.MIN_VALUE;

        while (!(input.equals("Stop"))){

            number = Integer.parseInt(input);

            if (number > max){
                max = number;
            }

            input = scanner.nextLine();

        }

        System.out.println(max);

    }
}
