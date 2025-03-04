//StudentOperations.java

import java.util.ArrayList;
import java.util.Scanner;

public class StudentOperations {

    private ArrayList<Student> studentList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.println("How many students? ");
        int numStudents = sc.nextInt();
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter Student ID: ");
            int studentId = sc.nextInt();

            System.out.println("Enter Full Name: ");
            sc.nextLine(); // Consume newline
            String fullName = sc.nextLine();

            System.out.println("Enter Birth Date (YYYY-MM-DD): ");
            String birthDate = sc.next();

            System.out.println("Enter Score: ");
            double score = sc.nextDouble();

            System.out.println("Enter Rank: ");
            int rank = sc.nextInt();

            Student student = new Student(studentId, fullName, score, birthDate);
            student.setRank(rank);
            studentList.add(student);
        }
    }

    public void displayStudents() {
        System.out.println("------ Student Details ------");
        System.out.println("ID\tName\tScore\tRank");

        for (Student student : studentList) {
            System.out.println(student.getStudentId() + "\t" + student.getFullName() + "\t" + student.getScore() + "\t" + student.getRank());
        }
    }

    public boolean deleteStudent() {
        System.out.println("Delete Student");
        System.out.println("Enter Student ID: ");
        int studentId = sc.nextInt();

        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId() == studentId) {
                System.out.println(studentList.get(i).getFullName() + " removed from the database.");
                studentList.remove(i);
                return true;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
        return false;
    }

    public void updateStudent() {
        System.out.println("Enter Student ID: ");
        int studentId = sc.nextInt();

        for (Student student : studentList) {
            if (student.getStudentId() == studentId) {
                System.out.println("Enter New Full Name: ");
                sc.nextLine(); // Consume newline
                String newName = sc.nextLine();
                student.setFullName(newName);

                System.out.println("Enter Birth Date: ");
                String birthDate = sc.next();
                student.setBirthDate(birthDate);

                System.out.println("Enter Score: ");
                double score = sc.nextDouble();
                student.setScore(score);

                System.out.println("Enter Rank: ");
                int rank = sc.nextInt();
                student.setRank(rank);

                System.out.println("Student with ID " + studentId + " updated successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
    }

    public void searchByPrn() {
        System.out.println("Enter Student ID to search: ");
        int studentId = sc.nextInt();

        for (Student student : studentList) {
            if (student.getStudentId() == studentId) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
    }

    public void searchByName() {
        System.out.println("Enter Full Name to search: ");
        sc.nextLine(); // Consume newline
        String desiredName = sc.nextLine();

        for (Student student : studentList) {
            if (student.getFullName().equalsIgnoreCase(desiredName)) {
                System.out.println("Student found: " + student);
                return;
            }
        }

        System.out.println("Student with name '" + desiredName + "' not found.");
    }

    public void searchByRank() {
        System.out.println("Enter Rank to search: ");
        int desiredRank = sc.nextInt();
        boolean found = false;

        for (Student student : studentList) {
            if (student.getRank() == desiredRank) {
                System.out.println("Student found: " + student);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with rank '" + desiredRank + "' not found.");
        }
    }
}