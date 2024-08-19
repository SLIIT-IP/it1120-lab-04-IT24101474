import java.util.Scanner;

public class IT24101474Lab4Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double examMarks = getValidMarks(scanner, "Enter the exam marks (0-100): ");
        
        double labMarks = getValidMarks(scanner, "Enter the lab submission marks (0-100): ");
 
        double examPercentage = getValidPercentage(scanner, "Enter the percentage for exam marks: ");
        
        double labPercentage = getValidPercentage(scanner, "Enter the percentage for lab submission marks: ");
      
        validatePercentages(examPercentage, labPercentage);

       
        double finalMark = calculateFinalMark(examMarks, labMarks, examPercentage, labPercentage);

       
        System.out.printf("The final mark is: " +finalMark);

        scanner.close();
    }

   
    private static double getValidMarks(Scanner scanner, String prompt) {
        double marks;
        while (true) {
            System.out.print(prompt);
            marks = scanner.nextDouble();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
            }
        }
        return marks;
    }

  
    private static double getValidPercentage(Scanner scanner, String prompt) {
        double percentage;
        while (true) {
            System.out.print(prompt);
            percentage = scanner.nextDouble();
            if (percentage >= 0 && percentage <= 100) {
                break;
            } else {
                System.out.println("Invalid input for exam marks.Terminating programme.");
            }
        }
        return percentage;
    }
    private static void validatePercentages(double examPercentage, double labPercentage) {
        if (examPercentage + labPercentage != 100) {
            throw new IllegalArgumentException("The sum of exam and lab percentages must be 100.");
        }
    }

    
    private static double calculateFinalMark(double examMarks, double labMarks, double examPercentage, double labPercentage) {
        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
        return finalMark;
    }
}
