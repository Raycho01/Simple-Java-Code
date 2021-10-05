package ex7;

import java.util.Scanner;

public class NumsTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >= 1; i--){
            System.out.printf("%d \n", i);
        }
    }
}
