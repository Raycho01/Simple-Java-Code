package ArraysExc;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for (int i = 1; i <= n; i++) {
            String[] temp = scanner.nextLine().split(" "); // 1 5
            if (i % 2 == 0) {
                array1[i-1] = Integer.parseInt(temp[0]);
                array2[i-1] = Integer.parseInt(temp[1]);
            }
            else {
                array1[i-1] = Integer.parseInt(temp[1]); // 1
                array2[i-1] = Integer.parseInt(temp[0]); // 5
            }
        }

        for (int i : array2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : array1) {
            System.out.print(i + " ");
        }

    }
}
