// Main.java - Menu-driven program for student management
// Name: [Your Name]
// PRN: [Your PRN]
// Batch: [Your Batch]

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();
        int choice;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            choice = scan.nextInt();
            scan.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter PRN: ");
                    String prn = scan.nextLine();
                    System.out.print("Enter Dept: ");
                    String dept = scan.nextLine();
                    System.out.print("Enter Batch: ");
                    String batch = scan.nextLine();
                    System.out.print("Enter CGPA: ");
                    double cgpa = scan.nextDouble();
                    operations.addStudent(new Student(name, prn, dept, batch, cgpa));
                    break;
                case 2:
                    operations.displayStudents();
                    break;
                case 3:
                    System.out.print("Enter PRN to search: ");
                    Student s1 = operations.searchByPrn(scan.nextLine());
                    System.out.println(s1 != null ? s1 : "Student not found.");
                    break;
                case 4:
                    System.out.print("Enter Name to search: ");
                    Student s2 = operations.searchByName(scan.nextLine());
                    System.out.println(s2 != null ? s2 : "Student not found.");
                    break;
                case 5:
                    System.out.print("Enter Position to search: ");
                    int pos = scan.nextInt();
                    Student s3 = operations.searchByPosition(pos);
                    System.out.println(s3 != null ? s3 : "Invalid position.");
                    break;
                case 6:
                    System.out.print("Enter PRN to update: ");
                    String updatePrn = scan.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scan.nextLine();
                    System.out.print("Enter New Dept: ");
                    String newDept = scan.nextLine();
                    System.out.print("Enter New Batch: ");
                    String newBatch = scan.nextLine();
                    System.out.print("Enter New CGPA: ");
                    double newCgpa = scan.nextDouble();
                    if (operations.updateStudent(updatePrn, newName, newDept, newBatch, newCgpa))
                        System.out.println("Student updated successfully.");
                    else
                        System.out.println("Student not found.");
                    break;
                case 7:
                    System.out.print("Enter PRN to delete: ");
                    if (operations.deleteStudent(scan.nextLine()))
                        System.out.println("Student deleted successfully.");
                    else
                        System.out.println("Student not found.");
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 8);

        scan.close();
    }
}