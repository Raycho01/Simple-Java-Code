package AssociativeArraysExc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {

    public static class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public double getTotalPrice() {
            return price * quantity;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Product> productMap = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (!line.equals("buy")) {
            String[] input = line.split(" ");
            String nameOfProduct = input[0];
            double priceOfProduct = Double.parseDouble(input[1]);
            int quantityOfProduct = Integer.parseInt(input[2]);

            Product potentialProduct = productMap.get(nameOfProduct);

            if (potentialProduct == null) {
                Product product = new Product(nameOfProduct, priceOfProduct, quantityOfProduct);
                productMap.put(nameOfProduct, product);
            }
            else {
                productMap.get(nameOfProduct).quantity += quantityOfProduct;
                if (productMap.get(nameOfProduct).price != priceOfProduct) {
                    productMap.get(nameOfProduct).price = priceOfProduct;
                }
            }

            line = scanner.nextLine();
        }

        productMap.forEach((key, value) -> System.out.printf("%s -> %.2f\n", key, value.getTotalPrice()));

    }
}
