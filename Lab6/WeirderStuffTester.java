public class WeirderStuffTester {
  public static void main(String[] args) {
    Character.printStats();
    System.out.println("---------1-----------");
    Character twelve = new Character("Twelve", "Kid", 100);
    twelve.printDetails();
    System.out.println("---------2-----------");
    Character spike = new Character("Spike", "Kid", 50);
    spike.printDetails();
    System.out.println("---------3-----------");
    Character.printStats();
    System.out.println("---------4-----------");
    Character reeve = new Character("Reeve", 70);
    reeve.printDetails();
    System.out.println("---------5-----------");
    Character chopper = new Character("Chopper", "Adult", 120);
    chopper.printDetails();
    System.out.println("---------6-----------");
    Character.printStats();
  }
}

class Character {
    private static int totalChar = 0;
    private static int kidC = 0;
    private static int teenC = 0;
    private static int adultC = 0;
    private static int totalHealth = 0;
    private static Character strongest = null;
    private int id;
    private String name;
    private String group;
    private int health;
    public Character(String name, String group, int health) {
        this.id = totalChar++;
        this.name = name;
        this.group = group;
        this.health = health;
        updateStats();
    }
    public Character(String name, int health) {
        totalChar++;
        this.id = totalChar;
        this.name = name;
        this.health = health;
        this.group = "Teen";
        updateStats();
    }
    private void updateStats() {
        totalHealth += health;
        if (group.equals("Kid")) {
            kidC++;
        } else if (group.equals("Teen")) {
            teenC++;
        } else if (group.equals("Adult")) {
            adultC++;
        }
        //ill do fix letter
        if (strongest == null || health > strongest.health) {
            strongest = this;
        }
    }
    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("Group: " + group);
        System.out.println("Health: " + health);
    }
    public static void printStats() {
        System.out.println("Total Characters: " + totalChar);
        System.out.println("Kids: " + kidC);
        System.out.println("Teens: " + teenC);
        System.out.println("Adults: " + adultC);
        if (totalChar == 0) {
            System.out.println("Average Health: 0");
            System.out.println("Strongest Character: None");
        } else {
            System.out.println("Average Health: " + (double)(totalHealth / totalChar));
            System.out.println("Strongest Character: ");
            System.out.println(strongest.name + " (Health " + strongest.health + ")");
        }
    }
}