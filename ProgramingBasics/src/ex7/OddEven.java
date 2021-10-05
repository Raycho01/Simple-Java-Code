package ex7;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int odd = 0;
        int even = 0;

        for (int i = 1; i <= n; i++){
            int numb = Integer.parseInt(scanner.nextLine());
            if(i % 2 == 0){
                even += numb;
            }
            else {
                odd += numb;
            }
        }

        if (even > odd){
            System.out.printf("No \nDiff = %d", even - odd);
        }
        else if (odd > even){
            System.out.printf("No \nDiff = %d", odd - even);
        }
        else {
            System.out.printf("Yes \nSum = %d", odd);
        }
    }
}
