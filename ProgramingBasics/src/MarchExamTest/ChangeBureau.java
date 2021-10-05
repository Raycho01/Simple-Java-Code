package MarchExamTest;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bitcoins = Double.parseDouble(scanner.nextLine());
        double chinese = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine()) / 100;
        double bitcoin_money;
        double chinese_money;
        double money_in_lv;
        double money_in_euro;

        bitcoin_money = bitcoins * 1168;
        chinese_money = 0.15 * chinese;
        chinese_money = chinese_money * 1.76;

        money_in_lv = bitcoin_money + chinese_money;
        money_in_lv = money_in_lv - (money_in_lv * tax);

        money_in_euro = money_in_lv / 1.95;
        System.out.printf("%.2f", money_in_euro);



    }
}
