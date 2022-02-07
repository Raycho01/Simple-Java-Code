package DataTypesAndVariablesExc;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 0;

        for (int i = 0; i < n; i++) {
            int add = Integer.parseInt(scanner.nextLine());
            capacity += add;
            if (capacity > 255) {
                System.out.println("Insufficient capacity!");
                capacity -= add;
            }
        }

        System.out.println(capacity);
    }
}
