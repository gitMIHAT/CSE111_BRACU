public class Company {
    public String compName= "ABC Company";
    public int totalEmployee;
    public Employee [] employees = new Employee[3];
    public int index;
    public void addEmployee(Employee obj){
        if(index < employees.length){
            employees[index++] = obj;
            System.out.println(obj.name +" has joined the company");
            totalEmployee ++;
        }else{
            System.out.println("No more vacancy");
        }
    }
public void removeEmployee(Employee obj) {
    for (int i = 0; i < index; i++) {
        if (employees[i].name.equals(obj.name)) {
            for (int j = i; j < index - 1; j++) {
                employees[j] = employees[j + 1];
            }
            employees[index - 1] = null;//this line is for error handling does not required for the output of assginment added to solve problem
            index--;
            totalEmployee--;
            System.out.println(obj.name + " has left the company");
            break;
        }
    }
}


    public void details(){
        System.out.println("Company Name: "+ compName +"\nTotal Employee: "+totalEmployee );
        System.out.println("Fulltime Employees:");
        if (employees[0]==null){
            
        }else{
            for(int i=0;i<index;i++){
                if(employees[i].employedStatus=="Fulltime"){
                    System.out.println("Name: "+employees[i].name+" Id: "+employees[i].Id);
                }
            }
        }
        System.out.println("Part-Time Employees:");
        if (employees[0]==null){
            
        }else{
            for(int i=0;i<index;i++){
                if(employees[i].employedStatus=="Part-time"){
                    System.out.println("Name: "+employees[i].name+" Id: "+employees[i].Id);
                }
            }
        }        
}
}