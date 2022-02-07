package BasicSyntaxExc;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int[] numbs = new int[input.length()];
        int[] sums = new int[input.length()];
        sums[0] = 1;
        int number = Integer.parseInt(input);

        for (int i = 0; i < input.length(); i++) {
            numbs[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
        }

        for(int i = 0; i < numbs.length; i++) {
            for (int j = 1; j <= numbs[i]; j++) {
                sums[i] *= j;
            }
        }

        int sum = 0;

        for (int i = 0; i < sums.length; i++) {
            sum += sums[i];
        }
        System.out.println(sum);
        if (sum == number) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }


    }
}
