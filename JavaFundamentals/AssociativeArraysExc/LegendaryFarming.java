package AssociativeArraysExc;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new LinkedHashMap<>();

        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        Map<String, Integer> junk = new LinkedHashMap<>();

        boolean shadowmourne = false;
        boolean valanyr = false;
        boolean dragonwrath = false;


        while (!shadowmourne && !valanyr && !dragonwrath) {

            String[] input = scanner.nextLine().split("\\s+");

            for (int i = 1; i < input.length; i+=2) {
                String currMaterial = input[i].toLowerCase(Locale.ROOT);
                int currQuantity = Integer.parseInt(input[i-1]);

                if (keyMaterials.containsKey(currMaterial)) {
                    keyMaterials.put(currMaterial, keyMaterials.get(currMaterial)
                            + currQuantity);
                    if (keyMaterials.get(currMaterial) >= 250) {
                        keyMaterials.put(currMaterial, keyMaterials.get(currMaterial) - 250);
                        switch (currMaterial) {
                            case "shards":
                                shadowmourne = true;
                                break;
                            case "fragments":
                                valanyr = true;
                                break;
                            case "motes":
                                dragonwrath = true;
                                break;
                        }
                        break;
                    }
                } else {
                    Integer containsMaterial = junk.get(currMaterial);
                    if (containsMaterial != null) {
                        junk.put(currMaterial, junk.get(currMaterial) + currQuantity);
                    }
                    else {
                        junk.put(currMaterial, currQuantity);
                    }
                }
            }

        }

        if (shadowmourne) {
            System.out.println("Shadowmourne obtained!");
        }
        else if (valanyr) {
            System.out.println("Valanyr obtained!");
        }
        else {
            System.out.println("Dragonwrath obtained!");
        }

        keyMaterials.forEach((key, value) -> System.out.println(key + ": " + value));
        junk.forEach((key, value) -> System.out.println(key + ": " + value));



    }
}
