package preExam;

import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = Integer.parseInt(scanner.nextLine());
        String service = scanner.nextLine();
        int profit = 0;

        while (true){

            if (service.equals("closed")){
                break;
            }

            if (service.equals("haircut")){
                service = scanner.nextLine();
                if (service.equals("mens")){
                    profit += 15;
                }
                else if (service.equals("ladies")){
                    profit += 20;
                }
                else {
                    profit += 10;
                }

            }

            else {
                service = scanner.nextLine();
                if (service.equals("touch up")){
                    profit += 20;
                }
                else {
                    profit += 30;
                }
            }

            if (goal <= profit){
                break;
            }

            service = scanner.nextLine();

            if (service.equals("closed")){
                break;
            }


        }

        if (goal <= profit){
            System.out.printf("You have reached your target for the day!\n");
        }
        else {
            System.out.printf("Target not reached! You need %dlv. more.\n", goal - profit);
        }

        System.out.printf("Earned money: %dlv.", profit);

    }
}
