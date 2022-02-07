package ArraysExc;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfWagons = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[numOfWagons];
        int sum = 0;

        for (int i = 0; i < numOfWagons; i ++) {
            wagons[i] = scanner.nextInt();
            System.out.print(wagons[i] + " ");
            sum += wagons[i];
        }

        System.out.println();
        System.out.println(sum);
    }
}
