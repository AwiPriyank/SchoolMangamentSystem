package SchoolMangementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceManagement {
    private ArrayList<Attendance> attendanceRecords;
    private Scanner scanner;

    public AttendanceManagement(Scanner scanner) {
        this.attendanceRecords = new ArrayList<>();
        this.scanner = scanner;
    }

    public void manageAttendance() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nAttendance Management:");
            System.out.println("1. Add Attendance");
            System.out.println("2. View Attendance Records");
            System.out.println("3. Update Attendance");
            System.out.println("4. Delete Attendance");
            System.out.println("5. Go Back");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addAttendance();
                    break;
                case 2:
                    viewAttendance();
                    break;
                case 3:
                    updateAttendance();
                    break;
                case 4:
                    deleteAttendance();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addAttendance() {
        System.out.print("Enter Attendance ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Is the student present? (true/false): ");
        boolean isPresent = scanner.nextBoolean();

        attendanceRecords.add(new Attendance(id, studentId, date, isPresent));
        System.out.println("Attendance record added successfully!");
    }

    private void viewAttendance() {
        if (attendanceRecords.isEmpty()) {
            System.out.println("No attendance records available.");
        } else {
            for (Attendance attendance : attendanceRecords) {
                System.out.println(attendance);
            }
        }
    }

    private void updateAttendance() {
        System.out.print("Enter Attendance ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        boolean found = false;

        for (Attendance attendance : attendanceRecords) {
            if (attendance.attenid == id) {
                System.out.print("Enter new Student ID: ");
                attendance.studentId = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter new Date (YYYY-MM-DD): ");
                attendance.date = scanner.nextLine();
                System.out.print("Is the student present? (true/false): ");
                attendance.present = scanner.nextBoolean();
                found = true;
                System.out.println("Attendance updated successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Attendance record with ID " + id + " not found.");
        }
    }

    private void deleteAttendance() {
        System.out.print("Enter Attendance ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        boolean found = false;

        for (Attendance attendance : attendanceRecords) {
            if (attendance.attenid == id) {
                attendanceRecords.remove(attendance);
                found = true;
                System.out.println("Attendance record deleted successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Attendance record with ID " + id + " not found.");
        }
    }
}
