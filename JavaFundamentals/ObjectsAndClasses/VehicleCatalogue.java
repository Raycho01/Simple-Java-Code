package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {

    public static class Vehicle {
        private String type;
        private String model;
        private String color;
        private int horsePower;

        public Vehicle(String type, String model, String color, int horsePower) {
            if (type.equals("car")) {
                this.type = "Car";
            }
            else {
                this.type = "Truck";
            }
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Type: " + type + "\nModel: " + model + "\nColor: " + color + "\nHorsepower: " + horsePower;
        }

        public static void showAverageHorsePower(List<Vehicle> vehicleList) {

            List<Vehicle> cars = new ArrayList<>();
            List<Vehicle> trucks = new ArrayList<>();

            boolean carFlag = false;
            boolean truckFlag = false;

            for (Vehicle vehicle : vehicleList) {
                if (vehicle.type.equals("Car")) {
                    cars.add(vehicle);
                    carFlag = true;
                }
                else {
                    trucks.add(vehicle);
                    truckFlag = true;
                }
            }

            double average = 0;

            if (!carFlag) {                                                     // if there are no cars
                System.out.print("Cars have average horsepower of: 0.00.\n");
            }
            else {
                for (Vehicle car : cars) {
                    average += car.horsePower;
                }

                average /= cars.size();

                System.out.printf("Cars have average horsepower of: %.2f.\n", average);
            }

            average = 0;

            if (!truckFlag) {                                                    // if there are no trucks
                System.out.print("Trucks have average horsepower of: 0.00.\n");
            }
            else {
                for (Vehicle truck : trucks) {
                    average += truck.horsePower;
                }

                average /= trucks.size();

                System.out.printf("Trucks have average horsepower of: %.2f.\n", average);
            }

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List<Vehicle> vehicleList = new ArrayList<>();

        while (!line.equals("End")) {
            String[] input = line.split(" ");

            Vehicle vehicle = new Vehicle(input[0], input[1], input[2], Integer.parseInt(input[3]));
            vehicleList.add(vehicle);

            line = scanner.nextLine();
        }

        line = scanner.nextLine();

        while (!line.equals("Close the Catalogue")) {
            String input = line;
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.model.equals(input)) {
                    System.out.println(vehicle.toString());
                }
            }
            line = scanner.nextLine();
        }

        Vehicle.showAverageHorsePower(vehicleList);
    }
}
