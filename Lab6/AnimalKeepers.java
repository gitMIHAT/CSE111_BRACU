public class Animalkeepers {
    public static String[] Animals = {"Lion", "Tiger", "Seal", "Gorilla", "Deer"};
    private static int nextId = 101;
    private static int totalKeepers = 0;
    private static String[] tasks = new String[Animals.length];
    private static String[] taskKeepers = new String[Animals.length];
    private static int totalTasks = 0;
    private String name;
    private int id;
    public Animalkeepers(String name) {
        this.name = name;
        this.id = nextId++;
        totalKeepers++;
        System.out.println(this.name + " with ID " + this.id + " got the job!");
    }
    public void doTask(String animal, String taskDesc) {
        int index = -1;
        for (int i = 0; i < Animals.length; i++) {
            if (Animals[i].equals(animal)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Animal not in the Safari");
            return;
        }
        tasks[index] = taskDesc;
        taskKeepers[index] = this.name;
        int count = 0;
        for (String t : tasks) {
            if (t != null) count++;
        }
        totalTasks = count;

        System.out.println("Task assigned to " + this.name);
    }
    public static void printTasks() {
        if (totalTasks == 0) {
            System.out.println("No tasks assigned.");
            return;
        }

        for (int i = 0; i < Animals.length; i++) {
            if (tasks[i] != null) {
                System.out.println(tasks[i] + " (Keeper - " + taskKeepers[i] + ") === " + Animals[i]);
            }
        }
    }

    public static void details() {
        if (totalKeepers == 0) {
            System.out.println("No Animal Keepers working yet.");
        } else {
            System.out.println("Total Animal Keeper: " + totalKeepers);
            System.out.println("Total Task assigned: " + totalTasks);
            printTasks();
        }
    }
}

