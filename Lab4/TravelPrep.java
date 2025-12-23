class Destination {
    public String type;
    public String name;
    public int cost;
    public Destination(String type, String name) {
        this.type = type;
        this.name = name;
        this.cost = 1250; 
        System.out.println(name + " " + type + " would cost at most " + cost + " yen");
    }

    public Destination(String type, String name, int cost) {
        this.type = type;
        this.name = name;
        this.cost = cost;
        System.out.println(name + " " + type + " costs " + cost + " yen");
    }
    public String updateCost(int nCost) {
        this.cost = nCost;
        return "Cost of " + name + " " + type + " updated to " + nCost;
    }
}
class TravelPrep {
    public String t_name;
    public int max_cost;
    private Destination[] itinerary = new Destination[10]; 
    private int destCount = 0;
    public TravelPrep() {
        System.out.println("1==================");
    }
    public TravelPrep(String name, int max_cost) {
        this.t_name = name;
        this.max_cost = max_cost;
        System.out.println(name + " would cost at most " + max_cost + " yen");
    }
    public void add_to_itinerary(Destination d1) {
        itinerary[destCount++] = d1;
        checkBudget();
    }
    public void add_to_itinerary(Destination d1, Destination d2) {
        itinerary[destCount++] = d1;
        itinerary[destCount++] = d2;
        checkBudget();
    }
    public void add_to_itinerary(Destination d1, Destination d2, Destination d3) {
        itinerary[destCount++] = d1;
        itinerary[destCount++] = d2;
        itinerary[destCount++] = d3;
        checkBudget();
    }
    public void show_itinerary() {
        System.out.println("Itinerary for " + t_name);
        int totalCost = 0;
        for (int i = 0; i < destCount; i++) {
            Destination d = itinerary[i];
            System.out.println((i + 1) + ". " + d.name + " " + d.type + " - " + d.cost + " yen");
            totalCost += d.cost;
        }
        System.out.println("Total cost of " + destCount + " destinations: " + totalCost + " yen");
    }
    private void checkBudget() {
        int totalCost = 0;
        for (int i = 0; i < destCount; i++) {
            totalCost += itinerary[i].cost;
        }
        if (totalCost > max_cost) {
            System.out.println("Budget going overboard");
        }
    }
}
