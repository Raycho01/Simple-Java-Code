package MidExam05072020;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int[] array = new int[input.length];

        for (int i = 0; i < input.length; i ++) {
            array[i] = Integer.parseInt(input[i]);
        }

        String command = scanner.nextLine();

        while (!(command.equals("end"))) {

            String[] split = command.split(" ");

            if (split[0].equals("swap")) {
                int temp = array[Integer.parseInt(split[1])];
                array[Integer.parseInt(split[1])] = array[Integer.parseInt(split[2])];
                array[Integer.parseInt(split[2])] = temp;
            }
            else if (split[0].equals("multiply")) {
                array[Integer.parseInt(split[1])] = array[Integer.parseInt(split[1])] * array[Integer.parseInt(split[2])];
            }
            else if (split[0].equals("decrease")) {
                for (int i = 0; i < array.length; i ++) {
                    array[i] --;
                }
            }

            command = scanner.nextLine();

        }

        for (int i = 0; i < array.length; i ++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            }
            else {
                System.out.print(array[i] + ", ");
            }
        }

    }
}
