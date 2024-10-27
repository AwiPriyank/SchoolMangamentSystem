package SchoolMangementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private String PASSWORD = "studentManagement";
    private ArrayList<Student> students;
    private Scanner scanner;

    public StudentManagement(Scanner scanner) {
        this.students = new ArrayList<>();
        this.scanner = scanner;
    }

    public void manageStudents(){
        System.out.print("Enter your password for student management: ");
        scanner.nextLine(); // Consume newline
        String password = scanner.nextLine();
        if (!password.equals(PASSWORD)) {
            System.out.println("Invalid password. Please try again.");
            return;
        }
        boolean exit = false;
        while (!exit) {
            System.out.println("\n Student Management:");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Go Back");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Subject: ");
        String subjects = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Address: ");
        scanner.nextLine();
        String address = scanner.nextLine();
        System.out.print("Enter Mobile Number: ");
        String mobileNumber = scanner.nextLine();

        students.add(new Student(id, name, subjects, email, age, address, mobileNumber));
        System.out.println("Student added successfully!");
    }

    private void viewStudent() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    private void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        boolean found = false;

        for (Student student : students) {
            if (student.id == id) {
                System.out.print("Enter new Name: ");
                student.name = scanner.nextLine();
                System.out.print("Enter new Subject: ");
                student.subjects = scanner.nextLine();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        } else {
            System.out.println("Student updated successfully!");
        }
    }

    private void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                index = i;
                break;
            }
        }

        if (index!= -1) {
            students.remove(index);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

}
