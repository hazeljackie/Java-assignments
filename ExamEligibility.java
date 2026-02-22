//CT100/G/21937/24
//Class ExamEligibility

import java.util.Scanner;

public class ExamEligibility {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.print("Enter attendance percentage: ");
        double attendance = Input.nextDouble();

        System.out.print("Enter average marks: ");
        double averageMarks = Input.nextDouble();

        if (attendance >= 75 && averageMarks >= 40) {
            System.out.println("Eligible for final exams.");
        } else {
            System.out.println("Not eligible.");
        }

        Input.close();
    }
}
