package ex12;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int odd = 0;
        int even = 0;

        for (int i = start; i <= end; i++){

            String currNum = "" + i;
            for (int j = 0; j < currNum.length(); j++){
                int currInt = Integer.parseInt("" + currNum.charAt(j));
                if (j % 2 == 0){
                    even += currInt;
                }
                else {
                    odd += currInt;
                }
            }

            if (odd == even){
                System.out.print(i + " ");
            }

            even = 0;
            odd = 0;

        }

    }
}
