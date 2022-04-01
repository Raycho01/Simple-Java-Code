package ExamPreparation.ExamExc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {

    public static class Item {

        private String name;
        private String date;
        private int calories;

        public Item(String name, String date, int calories) {
            this.name = name;
            this.date = date;
            this.calories = calories;
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([#|])(?<food>([A-Za-z ])+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1");
        Matcher matcher = pattern.matcher(input);

        List<Item> items = new ArrayList<>();
        int totalCalories = 0;

        while (matcher.find()) {

            String name = matcher.group("food");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            Item item = new Item(name, date, calories);
            items.add(item);

            totalCalories += calories;

        }

        int days = totalCalories / 2000;

        System.out.println("You have food to last you for: " + days + " days!");

        for (int i = 0; i < items.size(); i++) {
            System.out.println("Item: " + items.get(i).name + ", Best before: " + items.get(i).date + ", Nutrition: " + items.get(i).calories);
        }

    }
}
