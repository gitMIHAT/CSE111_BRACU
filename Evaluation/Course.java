public class Course {
    public String courseName;
    public String courseCode;
    public int credit;
    void updateDetails(String a,String b, int x){
        courseName= a;
        courseCode=b;
        credit =x;
    }
    void displayCourse(){
        System.out.println("Course Name: "+courseName);
        System.out.println("Course Code : "+courseCode);
        System.out.println("COurse Credit: "+credit);
    }
}
