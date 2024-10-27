package SchoolMangementSystem;
import java.util.ArrayList;
import java.util.Scanner;

public class TeacherManagement {
    private String PASSWORD = "teacherManagement";
    private ArrayList<Teacher> teachers;
    private Scanner scanner;

    public TeacherManagement(Scanner scanner) {
        this.teachers = new ArrayList<>();
        this.scanner = scanner;
    }

    public void manageTeachers(){
        System.out.print("Enter your password for teacher management: ");
        scanner.nextLine(); // Consume newline
        String password = scanner.nextLine();
        if (!password.equals(PASSWORD)) {
            System.out.println("Invalid password. Please try again.");
            return;
        }
        boolean exit = false;
        while (!exit) {
            System.out.println("\nTeacher Management:");
            System.out.println("1. Add Teacher");
            System.out.println("2. View Teachers");
            System.out.println("3. Update Teacher");
            System.out.println("4. Delete Teacher");
            System.out.println("5. Go Back");
            System.out.print("Enter your choice: ");
           
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    addTeacher();
                    break;
                case 2:
                    viewTeachers();
                    break;
                case 3:
                    updateTeacher();
                    break;
                case 4:
                    deleteTeacher();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                     System.out.println("Invalid choice. Please try again.");

            }
        }
    }



    private void addTeacher() {
        System.out.print("Enter Teacher ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Teacher Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();

        teachers.add(new Teacher(id, name, subject));
        System.out.println("Teacher added successfully!");
        

    }

    private void viewTeachers() {
        if (teachers.isEmpty()) {
            System.out.println("No teachers available.");
        } else {
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }
        }
    }

    private void updateTeacher() {
        System.out.print("Enter Teacher ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        boolean found = false;

        for (Teacher teacher : teachers) {
            if (teacher.id == id) {
                System.out.print("Enter new Name: ");
                teacher.name = scanner.nextLine();
                System.out.print("Enter new Subject: ");
                teacher.subject = scanner.nextLine();
                found = true;
                System.out.println("Teacher updated successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Teacher with ID " + id + " not found.");
        }
    }

    private void deleteTeacher() {
        System.out.print("Enter Teacher ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        boolean found = false;

        for (Teacher teacher : teachers) {
            if (teacher.id == id) {
                teachers.remove(teacher);
                found = true;
                System.out.println("Teacher deleted successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Teacher with ID " + id + " not found.");
        }
    }
}
