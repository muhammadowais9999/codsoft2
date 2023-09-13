package yyy;
import java.util.Scanner;
public class studentgradecalculator {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int numSubjects;
	        System.out.print("Enter the number of subjects: ");
	        numSubjects = scanner.nextInt();
	        
	        int[] marks = new int[numSubjects];
	        int totalMarks = 0;
	        
	        for (int i = 0; i < numSubjects; i++) {
	            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
	            marks[i] = scanner.nextInt();
	            totalMarks += marks[i];
	        }
	        
	        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;
	        
	        String grade;
	        if (averagePercentage >= 90) {
	            grade = "A+";
	        } else if (averagePercentage >= 80) {
	            grade = "A";
	        } else if (averagePercentage >= 70) {
	            grade = "B+";
	        } else if (averagePercentage >= 60) {
	            grade = "B";
	        } else if (averagePercentage >= 50) {
	            grade = "C";
	        } else {
	            grade = "F";
	        }
	        
	        System.out.println("\nTotal Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + averagePercentage + "%");
	        System.out.println("Grade: " + grade);
	    }
	}


