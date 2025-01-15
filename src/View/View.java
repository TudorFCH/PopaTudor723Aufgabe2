package View;

import java.util.Scanner;

public class View {
    private final Controller controller = new Controller();
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n---Fussballvereinmanagement---");
            System.out.println("1. Manage Players (CRUD)");
            System.out.println("2. Manage Teams (CRUD)");
            System.out.println("3. Filter Teams by City");
//            System.out.println("4. Get Players from certain Team");
//            System.out.println("5. Sort all Players in a Team by market value");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> managePlayers();
                case 2 -> manageTeams();
                case 3 -> filterTeamsByCity();
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
    private void managePlayers() {
        System.out.println("\n--- Manage Players ---");
        System.out.println("1. Add Player");
        System.out.println("2. View Players");
        System.out.println("3. Update Player");
        System.out.println("4. Delete Player");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter player name: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter player age: ");
                String name = scanner.nextLine();
                System.out.print("Enter player position: ");
                String location = scanner.nextLine();
                controller.addSpieler(name, alter, position, marktwert);
                System.out.println("Player added successfully!");
            }
            case 2 -> {
                System.out.println("\nPlayers:");
                controller.getSpieler().forEach(System.out::println);
            }
            case 3 -> {
                System.out.println("\nPlayers:");
                controller.getPlayers().forEach(System.out::println);
                System.out.print("Enter player name to update: ");
                String name = scanner.nextLine();
                scanner.nextLine();
                System.out.print("Enter new player age: ");
                int age = scanner.nextInt();
                System.out.print("Enter new player position: ");
                String position = scanner.nextLine();
                System.out.print("Enter new player value: ");
                int marktweret = scanner.nextInt();
                controller.updateSpieler(marktweret, position, marktwert);
                System.out.println("Customer updated successfully!");
            }
            case 4 -> {
                System.out.println("\nPlayers:");
                controller.getSpieler().forEach(System.out::println);
                System.out.print("Enter player name to delete: ");
                String name = scanner.nextLine();
                controller.deleteSpieler(name);
                System.out.println("Player deleted successfully!");
            }
            default -> System.out.println("Invalid choice.");
        }


        private void manageTeams () {
            System.out.println("\n--- Manage Teams ---");
            System.out.println("1. Add Teams");
            System.out.println("2. View Teams");
            System.out.println("3. Update Team");
            System.out.println("4. Delete Team");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {

                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {

                }
                default -> System.out.println("Invalid choice.");
            }


            private void filterTeamsByCity() {
                System.out.print("Enter city to filter by: ");
                String location = scanner.nextLine();
                controller.filterVereinenNachStadt(location).forEach(System.out::println);
            }

        }
    }
    public static void main(String[] args) {new View().start();}
}
