public class Connect {
    public boolean logInStatus;
    private String[] courses; 
    private Student[] advised = new Student[100]; 
    public int totalAdvised = 0;
    private int index = 0;

    public Connect() {
        System.out.println("Connect is ready to use!");
    }

    public void login(Student obj) {
        if (obj.email == null || obj.password == null) {
            System.out.println("Email and password need to be set.");
            logInStatus = false;
            return;
        }
        logInStatus = true;
        System.out.println("Login successful");
    }

    public void advising(Student obj) {
        if (logInStatus) {
            System.out.println("You haven't selected any courses.");
        } else {
            System.out.println("Please login to advise courses!");
        }
    }

    public void advising(Student obj, String fcourse, String scourse, String tcourse) {
        if (!logInStatus) {
            System.out.println("Please login to advise courses!");
            return;
        }

        index = 0;
        addvisedCourses = new String[3];
        addvisedCourses[index++] = fcourse;
        addvisedCourses[index++] = scourse;
        addvisedCourses[index++] = tcourse;

        System.out.println("Advising successful!");

        addToAdviseeList(obj);
    }

    public void advising(Student obj, String fcourse, String scourse, String tcourse, String frcourse) {
        if (!logInStatus) {
            System.out.println("Please login to advise courses!");
            return;
        }
        System.out.println("You need special approval to take more than 3 courses.");
    }

    private void addToAdviseeList(Student obj) {
        // Check if already in advised list
        for (int i = 0; i < totalAdvised; i++) {
            if (advised[i].id == obj.id) {
                return;  // already added
            }
        }

        advised[totalAdvised++] = obj;
        obj.courses = addvisedCourses; 
    }

    public void allAdviseeInfo() {
        System.out.println("Total Advisee: " + totalAdvised);
        for (int i = 0; i < totalAdvised; i++) {
            Student s = advised[i];

            System.out.println("Name: " + s.name + " ID: " + s.id);
            System.out.println("Department: " + s.dept);
            System.out.print("Advised Courses: ");
            if (s.courses == null || s.courses.length == 0) {
                System.out.println("None");
            } else {
                for (int j = 0; j < s.courses.length; j++) {
                    if (s.courses[j] != null) System.out.print(s.courses[j] + " ");
                }
                System.out.println();
            }

            System.out.println("==============");
        }
    }
}
