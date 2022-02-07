package ex10;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        int counter = 0;

        while (change != 0){

            if(change >= 2){
                change -= 2;
                counter ++;
                continue;
            }
            else if (change >= 1){
                change -= 1;
                counter++;
                continue;
            }
            else if (change >= 0.5){
                change -= 0.5;
                counter++;
                continue;
            }
            else if (change >= 0.2){
                change -= 0.2;
                counter++;
                continue;
            }
            else if (change >= 0.1){
                change -= 0.1;
                counter++;
                continue;
            }
            else if (change >= 0.05){
                change -= 0.05;
                counter++;
                continue;
            }
            else if (change >= 0.02){
                change -= 0.02;
                counter++;
                continue;
            }
            else {
                change -= 0.01;
                counter++;
                continue;
            }

        }

        System.out.println(counter);

    }
}
