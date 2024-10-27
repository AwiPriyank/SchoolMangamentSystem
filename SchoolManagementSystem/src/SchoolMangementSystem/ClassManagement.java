package SchoolMangementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassManagement {
    private String Password = "classManagement";
    private ArrayList<Class> classes;
    private Scanner scanner;

    public ClassManagement(Scanner scanner) {
        this.classes = new ArrayList<>();
        this.scanner = scanner;
    }

    public void manageClasses() {
        boolean exit = false;
        while (!exit) {
            System.out.print("Enter your Password for Class Management: ");
            scanner.nextLine(); // Consume newline
            String password = scanner.nextLine();
            if (!password.equals(Password)) {
                System.out.println("Invalid Password. Please try again.");
                continue;
            }
            System.out.println("\nClass Management:");
            System.out.println("1. Add Class");
            System.out.println("2. View Classes");
            System.out.println("3. Update Class");
            System.out.println("4. Delete Class");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addClass();
                    break;
                case 2:
                    viewClasses();
                    break;
                case 3:
                    updateClass();
                    break;
                case 4:
                    deleteClass();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


    private void addClass() {
        System.out.print("Enter Class ID: ");
        int classId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Class Name: ");
        String className = scanner.nextLine();
        System.out.print("Enter Teacher Name: ");
        String teacherName = scanner.nextLine();

        Class newClass = new Class(classId, className, teacherName);
        classes.add(newClass);
        System.out.println("Class added successfully.");
    }

    private void viewClasses() {
        if (classes.isEmpty()) {
            System.out.println("No classes available.");
        } else {
            for (Class aClass : classes) {
                System.out.println(aClass);
            }
        }
    }

    private void updateClass() {
        System.out.print("Enter Class ID to update: ");
        int classId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Class foundClass = null;
        for (Class aClass : classes) {
            if (aClass.getClassId() == classId) {
                foundClass = aClass;
                break;
            }
        }

        if (foundClass == null) {
            System.out.println("Class with ID " + classId + " not found.");
            return;
        }

        System.out.print("Enter New Class Name: ");
        String newClassName = scanner.nextLine();
        System.out.print("Enter New Teacher Name: ");
        String newTeacherName = scanner.nextLine();

        foundClass.setClassName(newClassName);
        foundClass.setTeacherName(newTeacherName);
        System.out.println("Class updated successfully.");
    }

    private void deleteClass() {
        System.out.print("Enter Class ID to delete: ");
        int classId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Class foundClass = null;
        for (Class aClass : classes) {
            if (aClass.getClassId() == classId) {
                foundClass = aClass;
                break;
            }
        }

        if (foundClass == null) {
            System.out.println("Class with ID " + classId + " not found.");
            return;
        }

        classes.remove(foundClass);
        System.out.println("Class deleted successfully.");
    }
    
}
