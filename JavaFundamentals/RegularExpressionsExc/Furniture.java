package RegularExpressionsExc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalPrice = 0;

        System.out.println("Bought furniture:");

        while (!input.equals("Purchase")) {

            Pattern pattern = Pattern.compile(">>(?<name>\\w+)<<(?<price>[\\d.]+)!(?<quantity>[1-9][\\d]*)");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                totalPrice += (price * quantity);
                System.out.println(name);
            }

            input = scanner.nextLine();

        }

        System.out.printf("Total money spend: %.2f", totalPrice);

    }
}
