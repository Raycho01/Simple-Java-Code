package ex5;

import java.util.Scanner;

public class GenderGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if(gender.equals("m")){
            if(age < 16){
                System.out.printf("Master");
            }
            else {
                System.out.printf("Mr.");
            }
        }
        else {
            if(age < 16){
                System.out.printf("Miss");
            }
            else {
                System.out.printf("Ms.");
            }
        }


    }
}
