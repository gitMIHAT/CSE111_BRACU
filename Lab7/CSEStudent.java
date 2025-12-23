public class CSEStudent extends Student{
    public static int total_student =0;
    public static String [] Courses= {"CSE110", "CSE111", "CSE220","CSE221"};
    public CSEStudent(String name,int id){
        super(name,id);
        total_student++;
    }

    public static void details(){
        System.out.println("Total CSE Students: "+total_student+"\nAvailable Lab Based Courses:");
        for(int i=0;i<Courses.length;i++){
            System.out.print(Courses[i]+" ");
        }
        System.out.println();
    }


    public void addLabBasedCourse(String course){
        courses+= course+ " ";
    }
}
