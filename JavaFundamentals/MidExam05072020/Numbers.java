package MidExam05072020;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        if (input.length > 1) {

            int[] array = new int[input.length];

            for (int i = 0; i < input.length; i ++) {
                array[i] = Integer.parseInt(input[i]);
            }

            int sum = 0;

            for (int j : array) {
                sum += j;
            }

            double average = (sum * 1.0) / array.length;
            int counter = 0;

            for (int i = 0; i < array.length; i ++) {
                if (array[i] > average) {
                    counter ++;
                }
            }

            Integer[] biggerThanAverage = new Integer[counter];

            counter = 0;

            for (int i = 0; i < array.length; i ++) {
                if (array[i] > average) {
                    biggerThanAverage[counter] = array[i];
                    counter ++;
                }
            }

            Arrays.sort(biggerThanAverage, Collections.reverseOrder());

            if (biggerThanAverage.length > 5) {
                int[] result = new int[5];
                for (int i = 0; i < 5; i ++) {
                    result[i] = biggerThanAverage[i];
                }
                for (int i : result) {
                    System.out.print(i + " ");
                }
            }
            else {
                for (int i : biggerThanAverage) {
                    System.out.print(i + " ");
                }
            }

            if (counter == 0) {
                System.out.println("No");
            }

        }
        else {
            System.out.println("No");
        }
    }
}
