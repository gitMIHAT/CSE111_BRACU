public class Student {
    public int id;
    public String[] courses;
    public double cg;
    public int index;

    public Student(int id) {
        this.id = id;
        System.out.println("A student with " + id + " has been created.");
    }

    public Student(int id, double cg) {
        this.id = id;
        this.cg = cg;
        if (cg > 3) {
            courses = new String[4];
        } else { 
            courses = new String[3];
        }
        System.out.println("A Student with ID: "+id+" and cgpa "+cg+" has been created.");
    }

    public void showAdvisee() {
        System.out.println("Student ID: " + id + ", CGPA: " + cg);
        System.out.println("Added courses are:");
        if (index == 0) {
            System.out.println("No courses added.");
            return;
        }

        for (int i = 0; i < index; i++) {
            System.out.print(courses[i] + " ");
        }
        System.out.println();
    }

    public void addCourse(String cname) {
        if (cg != 0) {
            if (cg < 3) {
                if (index == 3) {
                    System.out.println("Failed to add " + cname );
                    System.out.println("CG is low. Can't add more than 3");
                    return;
                }
                if (index < courses.length) {
                    courses[index++] = cname;
                }
            }
            else if (cg > 3) {
                if (index == 4) {
                    System.out.println("Failed to add " + cname );
                    System.out.println("Maximum 4 courses allowed."); 
                    return;
                }
                if (index < courses.length) {
                    courses[index++] = cname;
                }
            }
        } else {
            System.out.println("Failed to add " + cname + "\nSet CG first");
        }
    }

    public void removeAllCourse() {
        index = 0; // reset course count

        if (cg > 3) {
            courses = new String[4];
        } else {
            courses = new String[3];
        }
    }

    public void storeCG(double cg) {
        this.cg = cg;
        index = 0;

        if (cg > 3) {
            courses = new String[4];
        } else {
            courses = new String[3];
        }
    }

    public void storeID(int id) {
        this.id = id;
    }

    public void addCourse(String[] course) {
        for (int i = 0; i < course.length; i++) {
            addCourse(course[i]);   
        }
    }
}
