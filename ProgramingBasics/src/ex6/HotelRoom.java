package ex6;

import java.util.Scanner;

public class HotelRoom
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double studio_money = 0;
        double apartment_money = 0;
        double discount_studio = 0;
        double discount_apartment = 0;

        if(month.equals("May") || month.equals("October"))
        {

            studio_money = days * 50;
            apartment_money = days * 65;

            if(days > 7 && days <= 14)
            {

                discount_studio = 5.0 / 100.0;

            }
            else if(days > 14)
            {

                discount_studio = 30.0 / 100.0;

            }

        }

        else if(month.equals("June") || month.equals("September"))
        {

            studio_money = days * 75.20;
            apartment_money = days * 68.70;

            if(days > 14)
            {

                discount_studio = 20.0 / 100.0;

            }

        }

        else
        {

            studio_money = days * 76;
            apartment_money = days * 77;

        }

        if(days > 14)
        {

            discount_apartment = 10.0 / 100.0;

        }

        studio_money = studio_money - (studio_money * discount_studio);
        apartment_money = apartment_money - (apartment_money * discount_apartment);

        System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", apartment_money, studio_money);

    }

}
