public class MoneyTracker {
    public String name;
    public double balance;
    public double lastIncome;
    public double lastEx;
    public MoneyTracker() {
        System.out.println("A new money tracker has been launched.");
    }
     public String info() {
        String s= "Name: " + name + "\nCurrent Balance: " + balance;
        return s;
    }   
    public void createTracker(String n) {
        name = n;
        balance = 1.0;
    }
    public void expense(double m) {
        if (m > balance) {
            System.out.println("Not enough balance.");
        } else if (m == balance) {
            balance = 0;
            lastEx = m;
            System.out.println("You're broke!");
        } else {
            balance -= m;
            lastEx = m;
            System.out.println("Balance Updated.");
        }
    }
    public void showHistory() {
        System.out.println("Last added: " + lastIncome);
        System.out.println("Last spent: " + lastEx);
    }
    public void income(double a) {
    balance += a;
    lastIncome = a;
    System.out.println("Balance Updated!");
    }
}
