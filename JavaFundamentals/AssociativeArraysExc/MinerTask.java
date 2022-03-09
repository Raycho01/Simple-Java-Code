package AssociativeArraysExc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, Integer> materials = new LinkedHashMap<>();

        while (!line.equals("stop")) {
            String material = line;
            int quantity = Integer.parseInt(scanner.nextLine());

            Integer currQuantity = materials.get(material);

            if (currQuantity != null) {
                materials.put(material, materials.get(material) + quantity);
            }
            else {
                materials.put(material, quantity);
            }

            line = scanner.nextLine();
        }

        materials.forEach((key, value) -> System.out.println(key + " -> " + value));


    }
}
