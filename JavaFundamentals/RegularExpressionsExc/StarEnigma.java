package RegularExpressionsExc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        Pattern decrypt = Pattern.compile("[starSTAR]");

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        while (lines > 0) {

            String message = scanner.nextLine();

            Matcher matcher = decrypt.matcher(message);

            int counter = 0;

            while (matcher.find()) {
                counter ++;
            }

            StringBuilder decrypted = new StringBuilder(message.length());

            for (int i = 0; i < message.length(); i++) {
                char decryptedSymbol = message.charAt(i);
                decryptedSymbol -= counter;
                decrypted.append(decryptedSymbol);
            }

            Pattern valid = Pattern.compile("@(?<planet>[A-Za-z]+)([^@\\-!:>])*:([^@\\-!:>])*(?<population>[1-9][0-9]*)([^@\\-!:>])*!(?<typeAttack>[AD])!([^@\\-!:>])*->([^@\\-!:>])*(?<soldiers>[1-9][0-9]*)([^@\\-!:>])*");

            matcher = valid.matcher(decrypted.toString());

            if (matcher.find()) {
                String planet = matcher.group("planet");
                if (matcher.group("typeAttack").equals("A")) {
                    attackedPlanets.add(planet);
                }
                else {
                    destroyedPlanets.add(planet);
                }
            }

            lines --;
        }

        Collections.reverse(attackedPlanets);
        Collections.reverse(destroyedPlanets);

        System.out.println("Attacked planets: " + attackedPlanets.size());
        for (String attackedPlanet : attackedPlanets) {
            System.out.println("-> " + attackedPlanet);
        }
        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        for (String destroyedPlanet : destroyedPlanets) {
            System.out.println("-> " + destroyedPlanet);
        }


    }
}
