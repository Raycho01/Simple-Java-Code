package MethodsExc;

import java.util.Scanner;

public class SmallestNumber {

    public static int findSmallest(int[] a) {
        int min = a[0];
        for (int j : a) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[3];

        a[0] = scanner.nextInt();
        a[1] = scanner.nextInt();
        a[2] = scanner.nextInt();

        System.out.println(findSmallest(a));
    }
}
