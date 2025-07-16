public class Employee {
    public String name;
    public double salary =30000;
    public String designation ="junior";
    void newEmployee(String employeenames){
        name = employeenames;
    }
    void displayInfo(){
        System.out.println(name);
        System.out.println(salary);
        System.out.println(designation);
    }
    void calculateTax(){
        double tax =0;
        if(salary >50000){
            tax =salary * 30/100;
            System.out.println(name + " Tax Amount : "+ tax +" Tk");
        }
        else if(salary <30000 ){
            tax= salary *10/100;
            System.out.println(name + " Tax Amount : "+ tax +" Tk");
        }
        else{
            System.out.println("No need to pay tax");
        }
    }
    void promoteEmployee(String promote){
        if(promote.equals("senior")){
            salary +=25000;
            designation = promote;
            System.out.println(name+" has been promoted to "+designation );
            System.out.println("New salary :"+ salary);
        }
        else if(promote.equals("lead")){
            salary +=50000;
            designation = promote;
            System.out.println(name +" has been promoted to "+designation);
            System.out.println("New salary :"+ salary);
        }
        else if(promote.equals("manager")){
            salary +=75000;
            designation = promote;
            System.out.println(name +" has been promoted to "+designation);
            System.out.println("New salary :"+ salary);
        }
    }
}
