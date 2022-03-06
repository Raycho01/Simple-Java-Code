package ObjectsAndClasses;

import java.util.*;

public class OrderByAge {

    public static class Person {
        private String name;
        private String id;
        private int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public static Person getYoungest(List<Person> people) {
            int youngestAge = 999;
            Person youngestPerson = null;
            for (Person person : people) {
                if (person.age < youngestAge) {
                    youngestAge = person.age;
                    youngestPerson = person;
                }
            }
            return youngestPerson;
        }

        public static void printByAge(List<Person> people) {
            int size = people.size();
            List<Person> sorted = new ArrayList<>(people.size());
            for (int i = 0; i < size; i ++) {
                Person youngest = getYoungest(people);
                sorted.add(youngest);
                people.remove(youngest);
            }

            for (Person person : sorted) {
                System.out.println(person.name + " with ID: " + person.id + " is " + person.age + " years old.");
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Person> people = new ArrayList<>();

        while (!line.equals("End")) {
            String[] input = line.split(" ");
            Person person = new Person(input[0], input[1], Integer.parseInt(input[2]));
            people.add(person);
            line = scanner.nextLine();
        }

        Person.printByAge(people);

    }
}
