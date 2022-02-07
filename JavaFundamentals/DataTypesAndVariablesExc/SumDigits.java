package DataTypesAndVariablesExc;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int n = 0;
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            n = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += n;
        }

        System.out.println(sum);
    }
}
