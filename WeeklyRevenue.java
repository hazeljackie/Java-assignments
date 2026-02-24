//JACQUELINE GITONGA
//CT100/G/21937/24


import java.util.Scanner;

public class WeeklyRevenue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] revenue = new double[7];
        double total = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter revenue for day " + (i + 1) + ": ");
            revenue[i] = input.nextDouble();
            total += revenue[i];
        }

        double average = total / 7;

        System.out.println("Total Weekly Revenue: " + total);
        System.out.println("Average Daily Revenue: " + average);

        input.close();
    }
}
