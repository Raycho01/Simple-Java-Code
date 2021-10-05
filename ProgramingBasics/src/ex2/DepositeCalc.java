package ex2;

import java.util.Scanner;

public class DepositeCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine()) / 100;
        double final_money = money + months * ((money*percent) / 12);
        System.out.println(final_money);
    }
}
