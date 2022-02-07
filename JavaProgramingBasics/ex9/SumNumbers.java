package ex9;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int enterNum = Integer.parseInt(scanner.nextLine());
        int sum = enterNum;

        while(sum < num){
            enterNum = Integer.parseInt(scanner.nextLine());
            sum += enterNum;
        }

        System.out.println(sum);

    }
}
