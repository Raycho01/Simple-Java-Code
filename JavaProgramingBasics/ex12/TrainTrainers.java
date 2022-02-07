package ex12;

import java.util.Scanner;

public class TrainTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double[] scores = new double[jury];
        String[] info = new String[20];
        int j = -1;
        int count = 0;
        double sumAverage = 0;

        while (!(input.equals("Finish"))){

            double average = 0;

            for (int i = 0; i < jury; i++){
                scores[i] = Double.parseDouble(scanner.nextLine());
                average += scores[i];
            }

            j++;
            average = average / jury;
            count++;
            sumAverage += average;
            String s = String.format("%.2f", average);
            info[j] = input + " - " + s + ".";

            input = scanner.nextLine();


        }

        for (int i = 0; i < j+1; i++){
            System.out.println(info[i]);
        }

        sumAverage = sumAverage / count;

        System.out.printf("Student's final assessment is %.2f.", sumAverage);

    }
}
