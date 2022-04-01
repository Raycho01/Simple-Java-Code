package ExamPreparation.ExamLecture;

import java.util.*;

public class HeroesOfCodeAndLogicVII {

    static class Hero {

        String name;
        int health;
        int mana;

        public Hero(String name, int health, int mana) {
            this.name = name;
            this.health = health;
            this.mana = mana;
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Hero> party = new HashMap<>();
        String inputs;
        String name = "";
        int health = 0;
        int mana = 0;
        String[] input;

        for (int i = 0; i < n; i++) {
            inputs = scanner.nextLine();
            input = inputs.split(" ");
            name = input[0];
            health = Integer.parseInt(input[1]);
            mana = Integer.parseInt(input[2]);
            Hero hero = new Hero(name, health, mana);
            party.put(name,hero);
        }

        String line = scanner.nextLine();
        String[] command;

        while (!line.equals("End")) {
            command = line.split(" - ");
            String heroName = command[1];
            switch (command[0]) {
                case "CastSpell":
                    if (party.get(heroName).mana >= Integer.parseInt(command[2])) {
                        party.get(heroName).mana -= Integer.parseInt(command[2]);
                        System.out.println(heroName + " has successfully cast " + command[3] +
                                " and now has " + party.get(heroName).mana + " MP!");
                    }
                    else {
                        System.out.println(heroName + " does not have enough MP to cast " + command[3] + "!");
                    }
                    break;

                case "TakeDamage":
                    party.get(heroName).health -= Integer.parseInt(command[2]);
                    if (party.get(heroName).health > 0) {
                        System.out.println(heroName + " was hit for " + command[2] + " HP by " + command[3] +
                                " and now has " + party.get(heroName).health + " HP left!");
                    }
                    else {
                        System.out.println(heroName + " has been killed by " + command[3] + "!");
                        party.remove(heroName);
                    }
                    break;

                case "Recharge":
                    party.get(heroName).mana += Integer.parseInt(command[2]);
                    if (party.get(heroName).mana > 200) {
                        int extra = party.get(heroName).mana - 200;
                        party.get(heroName).mana = 200;
                        int recharged = Integer.parseInt(command[2]) - extra;
                        System.out.println(heroName + " recharged for " + recharged + " MP!");
                    }
                    else {
                        System.out.println(heroName + " recharged for " + command[2] + " MP!");
                    }
                    break;

                case "Heal":
                    party.get(heroName).health += Integer.parseInt(command[2]);
                    if (party.get(heroName).health > 100) {
                        int extra = party.get(heroName).health - 100;
                        party.get(heroName).health = 100;
                        int recharged = Integer.parseInt(command[2]) - extra;
                        System.out.println(heroName + " healed for " + recharged + " HP!");
                    }
                    else {
                        System.out.println(heroName + " healed for " + command[2] + " HP!");
                    }
                    break;
            }
            line = scanner.nextLine();
        }
        for (Map.Entry<String, Hero> stringHeroEntry : party.entrySet()) {
            System.out.println(stringHeroEntry.getKey());
            System.out.println("  HP: " + stringHeroEntry.getValue().health);
            System.out.println("  MP: " + stringHeroEntry.getValue().mana);
        }

    }
}
