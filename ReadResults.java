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

public class ReadResults {

    public static void main(String[] args) {

        try {

            
            try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("results.dat"))) {
                System.out.println("Student Results:\n");

                while (true) {

                    
                    Student s = (Student) input.readObject();

                    System.out.println("Name: " + s.name);
                    System.out.println("Marks: " + s.totalMarks);
                    System.out.println("----------------------");
                }
            }

        }
        catch (EOFException e) {
            System.out.println("End of records.");
        }
        catch (Exception e) {
            System.out.println("Error reading file.");
        }
    }
}