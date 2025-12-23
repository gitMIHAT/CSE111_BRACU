public class Department {
    public String sub;
    public int count;
    public Student[] students = new Student[5];
    public Department(String sub){
        this.sub = sub;
    }
    public void findStudent(int a){
        if (a <= 0) {
            System.out.println("Student with this ID doesn't exist, Please give a valid ID");
            return;
        }
        for (int i = 0; i < count; i++) {
            if (students[i].id == a) {
                System.out.println("Student info:");
                System.out.println("Student Name: " + students[i].name);
                System.out.println("ID: " + students[i].id);
                System.out.println("CGPA:  " + students[i].cgpa);
                return;
            }
        }
        System.out.println("Student with this ID doesn't exist, Please give a valid ID");
    }
    public void details(){
        System.out.println("Department Name: " + sub);
        System.out.println("Number of student:" + count);
        System.out.println("Details of the students: ");

        for (int i = 0; i < count; i++) {
            System.out.println("Student name: " + students[i].name + ", ID: " + students[i].id + ", cgpa: " + students[i].cgpa);
        }
    }
    public void addStudent(Student obj){

        if (count == 5) {  
            System.out.println("Cannot add more students, department is full!");  
            return;    
        }
        for (int i = 0; i < count; i++) {
            if (students[i].id == obj.id) {
                System.out.println("Student with the same ID already exists, Please try with another ID");
                return;
            }
        }
        students[count] = obj;
        count++;
        System.out.println("Welcome to " + sub + " department, " + obj.name);
    }
    public void addStudent(Student obj ,Student obj1 ,Student obj2){
        addStudent(obj);
        addStudent(obj1);
        addStudent(obj2);
    }
}
