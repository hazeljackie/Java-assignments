//CT100/G/21937/24

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DailySales {

    public static void main(String[] args) {

        double totalSales = 0;

        try {
            
            File file = new File("sales.txt");
            Scanner reader = new Scanner(file);

        
            while (reader.hasNextDouble()) {
                totalSales += reader.nextDouble();
            }

            reader.close();

            System.out.printf("Total Daily Sales: %.2f KES%n", totalSales);

        } catch (FileNotFoundException e) {
            System.out.println("Error: sales.txt file not found.");
        }
    }
}
