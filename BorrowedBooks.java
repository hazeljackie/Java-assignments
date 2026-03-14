//CT100/G/21937/24

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BorrowedBooks {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = input.nextLine();

        try {
            
            FileWriter writer = new FileWriter("borrowed_books.txt", true);
            writer.write(title + System.lineSeparator());
            writer.close();

            System.out.println("Book title successfully stored.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
        }

        input.close();
    }
}
