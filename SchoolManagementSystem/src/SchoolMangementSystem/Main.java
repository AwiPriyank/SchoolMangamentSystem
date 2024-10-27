package SchoolMangementSystem;

import java.util.Scanner;

public class Main {
   public Main() {
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      TeacherManagement teacherManagement = new TeacherManagement(scanner);
      StudentManagement studentManagement = new StudentManagement(scanner);
      ClassManagement classManagement = new ClassManagement(scanner);
      UserManagement userManagement = new UserManagement(scanner);
      ParentManagement parentManagement = new ParentManagement(scanner);
      StaffManagement staffManagement = new StaffManagement(scanner);
      AttendanceManagement attendanceManagement = new AttendanceManagement(scanner);
      boolean exit = false;

      while(!exit) {
         System.out.println("\nSchool Management System:");
         System.out.println("1. Teacher Management");
         System.out.println("2. Student Management");
         System.out.println("3. Class Management");
         System.out.println("4. User Management");
         System.out.println("5. Parent Management");
         System.out.println("6. Staff Management");
         System.out.println("7. Attendance Management");
         System.out.println("0. Exit");
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
         switch (choice) {
            case 0:
               exit = true;
               break;
            case 1:
               teacherManagement.manageTeachers();
               break;
            case 2:
               studentManagement.manageStudents();
               break;
            case 3:
               classManagement.manageClasses();
               break;
            case 4:
               userManagement.manageUsers();
               break;
            case 5:
               parentManagement.manageParents();
               break;
            case 6:
               staffManagement.manageStaff();
               break;
            case 7:
               attendanceManagement.manageAttendance();
               break;
            default:
               System.out.println("Invalid choice. Please try again.");
         }
      }

      scanner.close();
   }
}
