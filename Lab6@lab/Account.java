public class Account {
    static public String bankName="Badda Bank";
    static public double count;
    static public int totalBalance;
    public String name;
    private double balance;
    public String address;


    public Account (String name, String Adress){
        this.name= name;
        address= Adress;
    }
    public void printInfo(){
        System.out.println("Name: "+name + ", adress: "+);
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    
}
