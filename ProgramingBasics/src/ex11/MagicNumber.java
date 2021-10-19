package ex11;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean found = false;

        overloop:
            for (int i=start; i<=end; i++){
                for (int j=start; j<=end; j++){
                    counter++;
                    if (i+j == number){
                        System.out.println("Combination N:" + counter + " (" + i + " + " + j + " = " + (i+j) + ")");
                        found = true;
                        break overloop;
                    }
                }
            }


        if (!found){
            System.out.println(counter + " combinations - neither equals " + number);
        }

    }
}
