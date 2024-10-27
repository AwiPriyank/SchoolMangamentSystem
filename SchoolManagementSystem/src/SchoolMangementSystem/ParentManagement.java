package SchoolMangementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class ParentManagement {
    private String PASSWORD = "parentManagement";
    private ArrayList<Parent> parents;
    private Scanner scanner;

    public ParentManagement(Scanner scanner) {
        this.parents = new ArrayList<>();
        this.scanner = scanner;
    }

    public void manageParents() {
        boolean exit = false;
        while (!exit) {
            System.out.print("Enter your Password for Parent Management: ");
            scanner.nextLine(); // Consume newline
            String password = scanner.nextLine();

            if (!password.equals(PASSWORD)) {
                System.out.println("Invalid password. Please try again.");
                continue;
            }

            System.out.println("\nParent Management:");
            System.out.println("1. Add Parent");
            System.out.println("2. View Parent");
            System.out.println("3. Update Parent");
            System.out.println("4. Delete Parent");
            System.out.println("5. Go Back");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addParent();
                    break;
                case 2:
                    viewParent();
                    break;
                case 3:
                    updateParent();
                    break;
                case 4:
                    deleteParent();
                    break;

                case 5:
                    exit = true;
                    break;

                default:
                 System.out.println("Invalid choice. Please try again.");

            }
        }

                

    }

    private void addParent() {
        // Add code to add a new parent to the list
        System.out.print("Enter Parent ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Parent Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        parents.add(new Parent(id, name, email, phoneNumber, phoneNumber));
        System.out.println("Parent added successfully!");

        
    }

    private void viewParent() {
        if (parents.isEmpty()) {
            System.out.println("No parents available.");
        } else {
            for (Parent parent : parents) {
                System.out.println(parent);
            }
        }
    }

    private void updateParent() {
        System.out.print("Enter Parent ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        boolean found = false;

        for (Parent parent : parents) {
            if (parent.getId() == id) {
                found = true;
                System.out.print("Enter New Parent Name: ");
                String newName = scanner.nextLine();
                parent.setName(newName);
                System.out.println("Parent updated successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Parent not found.");
        }
    }

    private void deleteParent() {
        System.out.print("Enter Parent ID to delete: ");
        int id = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < parents.size(); i++) {
            if (parents.get(i).getId() == id) {
                index = i;
                break;
            }
        }

        if (index!= -1) {
            parents.remove(index);
            System.out.println("Parent deleted successfully!");
        } else {
            System.out.println("Parent not found.");
        }
    }

}