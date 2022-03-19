package RegularExpressionsExc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile(
                                        "%(?<name>[A-Z][a-z]+)%([^|$%.]*)" +
                                        "<(?<product>\\w+)>([^|$%.]*)" +
                                        "\\|(?<count>[1-9][0-9]*)\\|([^|$%.]*)" +
                                        "(?<price>[1-9][0-9.]*)\\$"
                                        );

        double totalIncome = 0;

        String input = scanner.nextLine();

        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                double itemTotalPrice = price * count;

                totalIncome += itemTotalPrice;

                System.out.printf("%s: %s - %.2f\n", name, product, itemTotalPrice);
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", totalIncome);

    }
}
