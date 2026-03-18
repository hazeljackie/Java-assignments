import java.io.*;

class Student implements Serializable {

    String name;
    String regNumber;
    double totalMarks;

    public Student(String name, String regNumber, double totalMarks) {
        this.name = name;
        this.regNumber = regNumber;
        this.totalMarks = totalMarks;
    }
}

public class WriteResults {

    public static void main(String[] args) {

        try {

            ObjectOutputStream output =
                    new ObjectOutputStream(new FileOutputStream("results.dat"));

            
            Student s1 = new Student("Daisy", "REG001", 75.5);
            Student s2 = new Student("Sharon", "REG002", 82.0);
            Student s3 = new Student("Paul", "REG003", 68.5);

            // Write to file
            output.writeObject(s1);
            output.writeObject(s2);
            output.writeObject(s3);

            output.close();

            System.out.println("File created and data written successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}