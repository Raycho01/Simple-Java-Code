package TextProcessingExc;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal bigDecimal = new BigDecimal(scanner.nextLine());

        int multiplier = Integer.parseInt(scanner.nextLine());

        System.out.println(bigDecimal.multiply(BigDecimal.valueOf(multiplier)));
    }
}
