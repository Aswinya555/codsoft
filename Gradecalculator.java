import java.util.Scanner;
public class Gradecalculator {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Request the number of subjects
        System.out.print("How many subjects do you want to enter marks for? ");
        int subjectCount = input.nextInt();
        int totalScore = 0;

        // Loop to get marks for each subject
        for (int i = 1; i <= subjectCount; i++) {
            System.out.print("Enter the marks for subject " + i + ": ");
            int marks = input.nextInt();
            totalScore += marks;
        }

        // Calculate the average percentage
        double percentage = (double) totalScore / (subjectCount * 100) * 100;

        // Determine the grade based on percentage
        char finalGrade;
        if (percentage >= 90) {
            finalGrade = 'A';
        } else if (percentage >= 80) {
            finalGrade = 'B';
        } else if (percentage >= 70) {
            finalGrade = 'C';
        } else if (percentage >= 60) {
            finalGrade = 'D';
        } else {
            finalGrade = 'F';
        }

        // Display the results
        System.out.println("-----------------------------");
        System.out.println("Total Marks: " + totalScore);
        System.out.println("Average Percentage: " + percentage + "%");
        System.out.println("Final Grade: " + finalGrade);

        input.close();
    }
}