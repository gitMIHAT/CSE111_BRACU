public class EmployeeTester {
 public static void main(String[] args) {
  Manager neymar = new Manager("Neymar",1000, 45, 10);
  Developer messi = new Developer("Messi", 1000, 50, "Java");
  Developer chiesa = new Developer("Chiesa", 1000, 50, "Javascript");
  neymar.calculateSalary();
  System.out.println("1.==========");
  neymar.displayInfo();
  System.out.println("2.==========");
  neymar.requestIncrement(100);
  System.out.println("3.==========");
  neymar.setHoursWorked(85);
  neymar.requestIncrement(100);
  System.out.println("4.==========");
  neymar.calculateSalary();
  System.out.println("5.==========");
  neymar.displayInfo();
  System.out.println("6.==========");
  messi.calculateSalary();
  System.out.println("7.==========");
  messi.displayInfo();
  System.out.println("8.==========");
  chiesa.calculateSalary();
  System.out.println("9.==========");
  chiesa.displayInfo();
 }
}

class Employee {
    public String name;
    private double baseSalary;
    private int hoursWorked;

    public Employee(String name, double baseSalary, int hoursWorked){
        this.name = name;
        this.baseSalary = baseSalary;
        this.hoursWorked = hoursWorked;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Work Hours: " + hoursWorked);
    }
}



//


class Manager extends Employee {
    private double bonusPercentage;
    public Manager(String name, double baseSalary, int hoursWorked, double bonusPercentage) {
        super(name, baseSalary, hoursWorked);
        this.bonusPercentage = bonusPercentage;
    }
    public void calculateSalary() {
        double finalSalary = getBaseSalary() + (getBaseSalary() * bonusPercentage / 100);
        System.out.println("Bonus: " + bonusPercentage + " %");
        System.out.println("Final Salary: $" + finalSalary);
    }
    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + getBaseSalary());
        System.out.println("Work Hours: " + getHoursWorked());
        System.out.println("Bonus: " + bonusPercentage + " %");
        double finalSalary = getBaseSalary() + (getBaseSalary() * bonusPercentage / 100);
        System.out.println("Final Salary: $" + finalSalary);
    }
    public void requestIncrement(double increment) {
        if (getHoursWorked() < 80) {
            System.out.println("Increment denied.");
        } else {
            setBaseSalary(getBaseSalary() + increment);
            System.out.println("$" + (int) increment + " Increment approved.");
        }
    }
}

class Developer extends Employee {
    private String language;
    public Developer(String name, double baseSalary, int hoursWorked, String language) {
        super(name, baseSalary, hoursWorked);
        this.language = language;
    }
    public void calculateSalary() {
        double finalSalary = getBaseSalary();
        if (language.equalsIgnoreCase("Java") && getHoursWorked() >= 50) {
            finalSalary += 700;
        }
        System.out.println("Final Salary: $" + finalSalary);
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Language: " + language);
        double finalSalary = getBaseSalary();
        if (language.equalsIgnoreCase("Java") && getHoursWorked() >= 50) {
            finalSalary += 700;
        }
        System.out.println("Final Salary: $" + finalSalary);
    }
}
