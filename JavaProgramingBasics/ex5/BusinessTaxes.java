package ex5;

import java.util.Scanner;

public class BusinessTaxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double stocks = Double.parseDouble(scanner.nextLine());
        double tax = 0;

        switch (city){
            case "Sofia":
                if(stocks >= 0 && stocks <= 500){
                    tax = 5.0 / 100.0;
                }
                else if(stocks > 500 && stocks <= 1000){
                    tax = 7.0 / 100.0;
                }
                else if(stocks > 1000 && stocks <= 10000){
                    tax = 8.0 / 100.0;
                }
                else {
                    tax = 12.0 / 100.0;
                }
                break;

            case "Varna":
                if(stocks >= 0 && stocks <= 500){
                    tax = 4.5 / 100;
                }
                else if(stocks > 500 && stocks <= 1000){
                    tax = 7.5 / 100.0;
                }
                else if(stocks > 1000 && stocks <= 10000){
                    tax = 10.0 / 100.0;
                }
                else {
                    tax = 13.0 / 100.0;
                }
                break;

            case "Plovdiv":
                if(stocks >= 0 && stocks <= 500){
                    tax = 5.5 / 100;
                }
                else if(stocks > 500 && stocks <= 1000){
                    tax = 8.0 / 100.0;
                }
                else if(stocks > 1000 && stocks <= 10000){
                    tax = 12.0 / 100.0;
                }
                else {
                    tax = 14.5 / 100.0;
                }
                break;
        }

        if(stocks < 0 || !city.equals("Sofia") && !city.equals("Varna") && !city.equals("Plovdiv")){
            System.out.print("error");
        }
        else {
            tax = stocks * tax;
            System.out.printf("%.2f", tax);
        }
    }
}
