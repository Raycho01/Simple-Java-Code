package ListsExc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strNumbers = scanner.nextLine().split(" ");
        int[] numbers = new int[strNumbers.length];

        for (int i = 0; i < strNumbers.length; i ++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }


        String[] input = scanner.nextLine().split(" ");
        int[] bomb = new int[input.length];

        for (int i = 0; i < input.length; i ++) {
            bomb[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < numbers.length; i ++) {
            if (numbers[i] == bomb[0]) {
                int counter = 0;
                for (int j = i; j >= 0; j --) {
                    if (counter > bomb[1]) {
                        break;
                    }
                    numbers[j] = 0;
                    counter ++;
                }
                counter = 0;
                for (int k = i + 1; k < numbers.length; k ++) {
                    if (counter == bomb[1]) {
                        break;
                    }
                    numbers[k] = 0;
                    counter ++;
                }
                counter = 0;
            }
        }

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum);
    }
}
