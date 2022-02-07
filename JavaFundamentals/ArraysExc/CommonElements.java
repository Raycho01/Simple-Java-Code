package ArraysExc;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input2.length; i ++) {
            for (int j = 0; j < input1.length; j ++) {
                if (input1[j].equals(input2[i])) {
                    stringBuilder.append(input1[j] + " ");
                    break;
                }
            }
        }

        System.out.println(stringBuilder);
    }
}
