public class Student {
    String name;
    int id;
    int codingMarks;
    int tracingMarks;
    static int total_students = 0;
    static int total_marks = 0;
    public Student(String name) {
        this.name = name;
        this.id = ++total_students;
        this.codingMarks = 0;
        this.tracingMarks = 0;
    }
    public Student(String name, int codingMarks, int tracingMarks) {
        this.name = name;
        this.id = ++total_students;
        this.codingMarks = codingMarks;
        this.tracingMarks = tracingMarks;
        total_marks += (codingMarks + tracingMarks);
    }
    public void setCodingMarks(int codingMarks) {
        this.codingMarks = codingMarks;
        total_marks += codingMarks;
    }
    public void setTracingMarks(int tracingMarks) {
        this.tracingMarks = tracingMarks;
        total_marks += tracingMarks;
    }
    public static double averageMarks() {
        return (double) total_marks / total_students;
    }
    public void individualDetail() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Coding Marks: " + codingMarks);
        System.out.println("Tracing Marks: " + tracingMarks);
        int total = codingMarks + tracingMarks;
        if (total >= 50) {
            System.out.println(name + " has passed with " + total + " marks");
        } else {
            System.out.println(name + " has failed with " + total + " marks");
        }
    }
}
