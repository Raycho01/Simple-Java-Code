package ex5;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numb = Double.parseDouble(scanner.nextLine());

        if(numb >= 100 && numb <= 200 || numb == 0){
            System.out.printf("");
        }
        else {
            System.out.printf("invalid");
        }
    }
}
