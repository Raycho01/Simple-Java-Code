package ex12;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int specialN = 0;

        for (int i = 1111; i < 9999; i++){
            String strNum = i + "";
            for (int j = 0; j < 4; j++){
                int number = Integer.parseInt(strNum.charAt(j)+"");
                if (number != 0 && n % number == 0){
                    specialN++;
                }
            }
            if (specialN == 4){
                System.out.print(i + " ");
            }
            specialN = 0;

        }

    }
}
