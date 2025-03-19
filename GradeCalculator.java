import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        // Get the student's score
        double score = getStudentScore();
        
        // Calculate the grade based on the score
        String grade = calculateGrade(score);
        
        // Display the grade
        System.out.println("Your Grade is: " + grade);
    }

    // Method to get the student's score
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score = 0;
        
        // Prompt the user to enter a score
        System.out.print("Enter your score: ");
        
        // Validate that the user entered a valid number
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid score.");
            scanner.next(); // Consume the invalid input
            System.out.print("Enter your score: ");
        }
        
        // Read the valid score input
        score = scanner.nextDouble();
        
        return score;
    }

    // Method to calculate the grade based on the score
    public static String calculateGrade(double score) {
        // Conditional statements to determine the grade
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
