package SchoolMangementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffManagement {
    private ArrayList<Staff> staffMembers;
    private Scanner scanner;

    public StaffManagement(Scanner scanner) {
        this.staffMembers = new ArrayList<>();
        this.scanner = scanner;
    }

    public void manageStaff() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nStaff Management:");
            System.out.println("1. Add Staff");
            System.out.println("2. View Staff Members");
            System.out.println("3. Update Staff");
            System.out.println("4. Delete Staff");
            System.out.println("5. Go Back");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStaff();
                    break;
                case 2:
                    viewStaff();
                    break;
                case 3:
                    updateStaff();
                    break;
                case 4:
                    deleteStaff();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addStaff() {
        System.out.print("Enter Staff ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Staff Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Position (e.g., Administrative, Support): ");
        String position = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        staffMembers.add(new Staff(id, name, position, department));
        System.out.println("Staff member added successfully!");
    }

    private void viewStaff() {
        if (staffMembers.isEmpty()) {
            System.out.println("No staff members available.");
        } else {
            for (Staff staff : staffMembers) {
                System.out.println(staff);
            }
        }
    }

    private void updateStaff() {
        System.out.print("Enter Staff ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        boolean found = false;

        for (Staff staff : staffMembers) {
            if (staff.staffId == id) {
                System.out.print("Enter new Name: ");
                staff.staffName = scanner.nextLine();
                System.out.print("Enter new Position: ");
                staff.position = scanner.nextLine();
                System.out.print("Enter new Department: ");
                staff.department = scanner.nextLine();
                found = true;
                System.out.println("Staff member updated successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Staff member with ID " + id + " not found.");
        }
    }

    private void deleteStaff() {
        System.out.print("Enter Staff ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        boolean found = false;

        for (Staff staff : staffMembers) {
            if (staff.staffId == id) {
                staffMembers.remove(staff);
                found = true;
                System.out.println("Staff member deleted successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Staff member with ID " + id + " not found.");
        }
    }
}

