public class StudentMain {

    public static void main(String[] args) {

        Student s1 = new Student("1","Alice",new int[]{80,70,90,85,75});
        Student s2 = new Student("2","Bob",new int[]{60,65,70,55,60});
        Student s3 = new Student("3","Carol",new int[]{90,95,92,88,91});

        s1.displayStudentReport();
        s2.displayStudentReport();
        s3.displayStudentReport();

        // Highest average
        Student top = s1;

        if(s2.getAverage() > top.getAverage()) top = s2;
        if(s3.getAverage() > top.getAverage()) top = s3;

        System.out.println("Top Student: " + top.getAverage());
    }
}
