package ex12;

import java.util.Scanner;

public class Pyramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 1;

        overloop:
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(counter + " ");
                if (counter == n){
                    break overloop;
                }
                counter++;
            }
            System.out.println();
        }

    }
}
