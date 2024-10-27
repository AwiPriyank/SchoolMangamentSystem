package SchoolMangementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManagement {

    private String Password = "userManagement";
    private ArrayList<User> users;
    private Scanner scanner;
    
    public UserManagement(Scanner scanner) {
        this.users = new ArrayList<>();
        this.scanner = scanner;
    }

    public void manageUsers() {
        System.out.print("Enter your password for user management: ");
        scanner.nextLine(); // Consume newline
        String password = scanner.nextLine();
        if (!password.equals(Password)) {
            System.out.println("Invalid password. Please try again.");
            return;
        }
        boolean exit = false;
        while (!exit) {
            System.out.println("\nUser Management:");
            System.out.println("1. Add User");
            System.out.println("2. View Users");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    viewUsers();
                    break;
                case 3:
                    updateUser();
                    break;
                case 4:
                    deleteUser();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addUser() {
        System.out.print("Enter User ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter User Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        System.out.print("Enter User Category (Student/Teacher): ");
        String category = scanner.nextLine();
        System.out.print("Is User Active? (true/false): ");
        boolean isActive = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline

        User newUser = new User(id, name, email, phoneNumber, age, password, category, isActive);
        users.add(newUser);
        System.out.println("User added successfully.");
        
    }
    
    private void viewUsers() {
        if (users.isEmpty()) {
            System.out.println("No users available.");
        } else {
            for (User user : users) {
                System.out.println(user);
            }
        }
    }
    
    private void updateUser() {
        System.out.print("Enter User ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        User foundUser = null;
        for (User user : users) {
            if (user.getAge() == id) {
                foundUser = user;
                break;
            }
        }

        if (foundUser == null) {
            System.out.println("User with ID " + id + " not found.");
            return;
        }

        System.out.print("Enter New User Name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter New Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter New Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter New Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter New Password: ");
        String newPassword = scanner.nextLine();
        System.out.print("Enter New User Category (Student/Teacher): ");
        String newCategory = scanner.nextLine();
        System.out.print("Is New User Active? (true/false): ");
        boolean newIsActive = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline

        foundUser.setName(newName);
        foundUser.setEmail(email);
        foundUser.setPhoneNumber(phoneNumber);
        foundUser.setAge(age);
        foundUser.setPassword(newPassword);
        foundUser.setCategory(newCategory);
        foundUser.setActive(newIsActive);
        
    }

    private void deleteUser() {
        System.out.print("Enter User ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        User foundUser = null;
        for (User user : users) {
            if (user.getAge() == id) {
                foundUser = user;
                break;
            }
        }

        if (foundUser == null) {
            System.out.println("User with ID " + id + " not found.");
            return;
        }

        users.remove(foundUser);
        System.out.println("User deleted successfully.");
    }
    
}
