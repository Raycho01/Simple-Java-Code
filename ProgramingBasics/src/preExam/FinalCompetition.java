package preExam;

import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = scanner.nextLine();

        double finalMoney = 0;

        if (location.equals("Bulgaria")){

            finalMoney = dancers * points;

            if (season.equals("summer")){
                finalMoney -= finalMoney * 0.05;
            }
            else {
                finalMoney -= finalMoney * 0.08;
            }

        }
        else {

            finalMoney = dancers * points;
            finalMoney+= finalMoney * 0.5;

            if (season.equals("summer")){
                finalMoney -= finalMoney * 0.1;
            }
            else {
                finalMoney -= finalMoney * 0.15;
            }

        }

        double charityMoney = finalMoney * 0.75;
        finalMoney -= charityMoney;

        double moneyPerson = finalMoney / dancers;

        System.out.printf("Charity - %.2f\n", charityMoney);
        System.out.printf("Money per dancer - %.2f", moneyPerson);





    }
}
