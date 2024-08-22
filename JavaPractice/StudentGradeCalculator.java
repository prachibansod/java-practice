package JavaPractice;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String studentName = scanner.nextLine();

        ArrayList<Integer> marks = new ArrayList<>();
        int totalMarks = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            int mark = scanner.nextInt();
            marks.add(mark);
            totalMarks += mark;
        }

        double averageMarks = totalMarks / 5.0;

        char grade;
        if (averageMarks >= 90) {
            grade = 'A';
        } else if (averageMarks >= 80) {
            grade = 'B';
        } else if (averageMarks >= 70) {
            grade = 'C';
        } else if (averageMarks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);
    }
}
