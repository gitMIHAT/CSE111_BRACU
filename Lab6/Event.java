class Organizer {
    private String name;
    private Event[] organized = new Event[4];
    private int organizedCount = 0;

    public Organizer() { this.name = null; System.out.println("Please provide the organizer's name"); }
    public Organizer(String name) { this.name = name; }

    public void organizeEvent(Event e) {
        if (name == null) { 
            System.out.println("Organizer name not set!"); 
            return; 
        }
        if (organizedCount < organized.length) {
            organized[organizedCount++] = e;
        }
        System.out.println(name + " successfully organized " + e.getName());
    }

    public void searchEventByDate(String date) {
        boolean found = false;
        for (int i = 0; i < organizedCount; i++) {
            if (organized[i].getDate().equals(date)) { 
                System.out.println(organized[i].getName()); found = true; 
            }
        }
        if (!found){
             System.out.println("No event is scheduled for " + date);
        }
    }
}

public class Event {
    private String name;
    private String date;
    private static Event[] Events = new Event[5];
    private static int Count = 0;

    public Event(String name, String date) {
        this.name = name;
        this.date = date;
        if (Count < Events.length) Events[Count++] = this;
    }

    public String getName() {
         return name; 
    }
    public String getDate() {
         return date; 
    }

    public String details() {
         return "Name: " + name + "\nDate: " + date; 
    }

    public static void allEventInfo() {
        System.out.println("Total Events: " + Count);
        System.out.println("Event Details: ");
        for (int i = 0; i < Count; i++) {
            System.out.println("Event " + (i + 1) + ":");
            System.out.println("Name: " + Events[i].name);
            System.out.println("Date: " + Events[i].date);
        }
    }
}