package View;

import Modell.*;
import Controller.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    private final Controller controller = new Controller();
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("1. CRUD Produkte");
            System.out.println("2. CRUD Charakter");
            System.out.println("3. Filter nach herkunftsdorf");
            System.out.println("4. Punkt D");
            System.out.println("5. Punkt E");
            System.out.println("6. Purchase Product");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> manageProducts();
                case 2 -> manageCustomers();
                case 3 -> filterCustomersByLocation();
                case 4 -> displayCustomersBySeason();
                case 5 -> sortCustomerProducts();
                case 6 -> purchaseProduct();
                case 7 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void manageProducts() {
        System.out.println("\n--- Manage Products ---");
        System.out.println("1. Add Product");
        System.out.println("2. View Products");
        System.out.println("3. Update Product");
        System.out.println("4. Delete Product");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter product name: ");
                String name = scanner.nextLine();
                System.out.print("Enter product price: ");
                double preis = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter product season: ");
                String herkunftsregion = scanner.nextLine();
                controller.addProdukt(name, preis, herkunftsregion);
                System.out.println("Product added successfully!");
            }
            case 2 -> {
                System.out.println("\nProducts:");
                controller.getProducts().forEach(System.out::println);
            }
            case 3 -> {
                System.out.println("\nProducts:");
                controller.getProducts().forEach((product) -> System.out.println(controller.getProducts().indexOf(product) + ": " + product));
                System.out.print("Enter product index to update: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter new product name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new product price: ");
                double preis = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter new product season: ");
                String herkunftsregion = scanner.nextLine();
                controller.updateProduct(index, name, preis, herkunftsregion);
                System.out.println("Product updated successfully!");
            }
            case 4 -> {
                System.out.println("\nProducts:");
                controller.getProducts().forEach((product) -> System.out.println(controller.getProducts().indexOf(product) + ": " + product));
                System.out.print("Enter product index to delete: ");
                int index = scanner.nextInt();
                controller.deleteProduct(index);
                System.out.println("Product deleted successfully!");
            }
            default -> System.out.println("Invalid choice.");
        }
    }

    private void manageCustomers() {
        System.out.println("\n--- Manage Charakters ---");
        System.out.println("1. Add Charakter");
        System.out.println("2. View Charakters");
        System.out.println("3. Update Character");
        System.out.println("4. Delete Character");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter customer ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter customer name: ");
                String name = scanner.nextLine();
                System.out.print("Enter customer location: ");
                String location = scanner.nextLine();
                controller.addCharakter(id, name, location);
                System.out.println("Customer added successfully!");
            }
            case 2 -> {
                System.out.println("\nCustomers:");
                controller.getCharakters().forEach(System.out::println);
            }
            case 3 -> {
                System.out.println("\nCustomers:");
                controller.getCharakters().forEach(System.out::println);
                System.out.print("Enter customer ID to update: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter new customer name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new customer location: ");
                String location = scanner.nextLine();
                controller.updateCharakteren(id, name, location);
                System.out.println("Customer updated successfully!");
            }
            case 4 -> {
                System.out.println("\nCustomers:");
                controller.getCharakters().forEach(System.out::println);
                System.out.print("Enter customer ID to delete: ");
                int id = scanner.nextInt();
                controller.deleteCharakter(id);
                System.out.println("Customer deleted successfully!");
            }
            default -> System.out.println("Invalid choice.");
        }
    }

    private void filterCustomersByLocation() {
        System.out.print("Enter location to filter by: ");
        String location = scanner.nextLine();
        controller.filterCharakterenByHerkunftsdorf(location).forEach(System.out::println);
    }

    private void displayCustomersBySeason() {
        System.out.print("Enter herkunft to filter by: ");
        String season = scanner.nextLine();
        controller.getCharakterByProductDorf(season).forEach(System.out::println);
    }

    private void sortCustomerProducts() {
        System.out.print("Enter customer ID: ");
        int customerId = scanner.nextInt();
        System.out.print("Enter sorting mode (1 for ascending, 0 for descending): ");
        boolean ascending = scanner.nextInt() == 1;
        controller.sortProductsOfCharakter(customerId, ascending).forEach(System.out::println);
    }

    private void purchaseProduct() {
        System.out.print("Enter customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        controller.purchaseProduct(customerId, productName);
    }

    public static void main(String[] args) {
//        // Initialisierung der Produkte
//        produkte.add(new Produkten("Kunai", 50.0, "Konoha"));
//        produkte.add(new Produkten("Shuriken", 30.0, "Konoha"));
//        produkte.add(new Produkten("Schwert", 200.0, "Kirigakure"));
//        produkte.add(new Produkten("Heiltrank", 100.0, "Sunagakure"));
//        produkte.add(new Produkten("Sprengsiegel", 75.0, "Iwagakure"));
//        produkte.add(new Produkten("Riesenfächer", 300.0, "Sunagakure"));
//        produkte.add(new Produkten("Giftklinge", 150.0, "Kirigakure"));
//        produkte.add(new Produkten("Explosionskugel", 250.0, "Iwagakure"));
//        produkte.add(new Produkten("Schattendolch", 180.0, "Konoha"));
//        produkte.add(new Produkten("Wasserperle", 90.0, "Kirigakure"));
//
//        // Initialisierung der Charaktere
//        List<Charakteren> charaktere = new ArrayList<>();
//
//        Charakteren c1 = new Charakteren(1, "Naruto Uzumaki", "Konoha");
//
//        c1.addProdukten(produkte.get(3)); // Heiltrank
//        c1.addProdukten(produkte.get(8)); // Schattendolch
//        c1.addProdukten(produkte.get(5)); // Riesenfächer
//
//        Charakteren c2 = new Charakteren(2, "Gaara", "Sunagakure");
//        c2.addProdukten(produkte.get(2)); // Schwert
//        c2.addProdukten(produkte.get(4)); // Sprengsiegel
//        c2.addProdukten(produkte.get(6)); // Giftklinge
//        c2.addProdukten(produkte.get(1)); // Shuriken
//
//        Charakteren c3 = new Charakteren(3, "Kisame Hoshigaki", "Kirigakure");
//        c3.addProdukten(produkte.get(1)); // Shuriken
//        c3.addProdukten(produkte.get(2)); // Schwert
//        c3.addProdukten(produkte.get(3)); // Heiltrank
//        c3.addProdukten(produkte.get(7)); // Explosionskugel
//        c3.addProdukten(produkte.get(9)); // Wasserperle
//
//        Charakteren c4 = new Charakteren(4, "Deidara", "Iwagakure");
//        c4.addProdukten(produkte.get(0)); // Kunai
//        c4.addProdukten(produkte.get(4)); // Sprengsiegel
//        c4.addProdukten(produkte.get(7)); // Explosionskugel
//        c4.addProdukten(produkte.get(9)); // Wasserperle
//
//        Charakteren c5 = new Charakteren(5, "Itachi Uchiha", "Konoha");
//        c5.addProdukten(produkte.get(8)); // Schattendolch
//        c5.addProdukten(produkte.get(6)); // Giftklinge
//        c5.addProdukten(produkte.get(2)); // Schwert
//        c5.addProdukten(produkte.get(7)); // Explosionskugel
//
//        charaktere.add(c1);
//        charaktere.add(c2);
//        charaktere.add(c3);
//        charaktere.add(c4);
//        charaktere.add(c5);

        new View().start();
    }
}
