package ExamPreparation.Exam04042020;

import java.util.*;

public class Pirates {

    public static class City {

        private String name;
        private int people;
        private int gold;

        public City(String name, int people, int gold) {
            this.name = name;
            this.people = people;
            this.gold = gold;
        }

    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, City> cities = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (!line.equals("Sail")) {

            String[] cityInfo = line.split("\\|\\|");

            String nameCity = cityInfo[0];
            int peopleCity = Integer.parseInt(cityInfo[1]);
            int goldCity = Integer.parseInt(cityInfo[2]);

            City potentialCity = cities.get(nameCity);

            if (potentialCity != null) {
                potentialCity.people += peopleCity;
                potentialCity.gold += goldCity;
            } else {
                City currCity = new City(nameCity, peopleCity, goldCity);
                cities.put(nameCity, currCity);
            }

            line = scanner.nextLine();

        }

        line = scanner.nextLine();

        while (!line.equals("End")) {

            String[] command = line.split("=>");

            String event = command[0];
            String nameCity = command[1];

            if (event.equals("Prosper")) {

                int goldToAdd = Integer.parseInt(command[2]);

                if (goldToAdd < 0) {
                    System.out.println("Gold added cannot be a negative number!");
                } else {
                    cities.get(nameCity).gold += goldToAdd;
                    System.out.println(goldToAdd + " gold added to the city treasury. " + nameCity + " now has " + cities.get(nameCity).gold + " gold.");
                }

            } else {

                int peopleToKill = Integer.parseInt(command[2]);
                int goldToSteal = Integer.parseInt(command[3]);

                City attackedCity = cities.get(nameCity);

                attackedCity.people -= peopleToKill;
                attackedCity.gold -= goldToSteal;

                System.out.println(nameCity + " plundered! " + goldToSteal + " gold stolen, " + peopleToKill + " citizens killed.");


                if (attackedCity.gold == 0 || attackedCity.people == 0) {
                    System.out.println(nameCity + " has been wiped off the map!");
                    cities.remove(nameCity);
                }

            }

            line = scanner.nextLine();

        }

        if (cities.size() > 0) {
            System.out.println("Ahoy, Captain! There are " + cities.size() + " wealthy settlements to go to:");
            cities.forEach((key, value) -> System.out.println(key + " -> Population: " + value.people + " citizens, Gold: " + value.gold + " kg"));
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }

    }
}
