//Main.java

import java.util.Scanner;

//NAME : Sharvari Godbole
//PRN : 23070126117
//BATCH : AIML B2

public class Main {

    public static void main(String[] args) {
        StudentOperations studentOperations = new StudentOperations();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add students");
            System.out.println("2. Display students");
            System.out.println("3. Search student by ID");
            System.out.println("4. Search student by Name");
            System.out.println("5. Search student by Rank");
            System.out.println("6. Update student by ID");
            System.out.println("7. Delete student by ID");
            System.out.println("8. Exit");

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentOperations.addStudent();
                    break;
                case 2:
                    studentOperations.displayStudents();
                    break;
                case 3:
                    studentOperations.searchByPrn();
                    break;
                case 4:
                    studentOperations.searchByName();
                    break;
                case 5:
                    studentOperations.searchByRank();
                    break;
                case 6:
                    studentOperations.updateStudent();
                    break;
                case 7:
                    studentOperations.deleteStudent();
                    break;
                case 8:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }

        } while (choice != 8);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}