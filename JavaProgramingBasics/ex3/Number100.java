package ex3;

import java.util.Scanner;

public class Number100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb = Integer.parseInt(scanner.nextLine());

        if(numb < 100){
            System.out.println("Less than 100");
        }
        else if(numb >= 100 && numb <= 200){
            System.out.println("Between 100 and 200");
        }
        else{
            System.out.println("Greater than 200");
        }
    }
}
