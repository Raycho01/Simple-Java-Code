package ex7;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int min = 999999999;
        int max = -999999999;

        for (int i = 0; i < n; i++){
            int numb = Integer.parseInt(scanner.nextLine());
            if(numb < min){
                min = numb;
            }
            if(numb > max){
                max = numb;
            }
        }

        System.out.printf("Max number: %d \n", max);
        System.out.printf("Min number: %d", min);


    }
}
