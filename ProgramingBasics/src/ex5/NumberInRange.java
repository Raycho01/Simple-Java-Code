package ex5;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb = Integer.parseInt(scanner.nextLine());

        if(numb >= -100 && numb <= 100 && numb != 0){
            System.out.printf("Yes");
        }
        else {
            System.out.printf("No");
        }
    }
}
