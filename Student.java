public class Student {

    private String studentId;
    private String name;
    private int[] marks;

    public Student(String studentId, String name, int[] marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public int calculateTotal() {
        int sum = 0;
        for(int m : marks) sum += m;
        return sum;
    }

    public double calculateAverage() {
        return calculateTotal() / 5.0;
    }

    public char findGrade() {
        double avg = calculateAverage();
        if(avg >= 80) return 'A';
        else if(avg >= 60) return 'B';
        else if(avg >= 50) return 'C';
        else return 'F';
    }

    public void displayStudentReport() {
        System.out.println(studentId + " " + name +
                " Total: " + calculateTotal() +
                " Avg: " + calculateAverage() +
                " Grade: " + findGrade());
    }

    public double getAverage(){
        return calculateAverage();
    }

    public void displayStudentReport1() {
        throw new UnsupportedOperationException("Unimplemented method 'displayStudentReport'");
    }
}
