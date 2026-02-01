class Audience {
  private String name;
  public Audience(String name) {
    this.name = name;
  }
  public void buyConcertTicket(Concert concert, String zone, int quantity) {
    System.out.println(name + " bought " + quantity + " ticket(s) in Zone " + zone);
    concert.buyTicket(zone, quantity);
  } 
  public void buyConcertTicket(Concert concert, String zone) {
    System.out.println(name + " bought 1 ticket(s) in Zone " + zone);
    concert.buyTicket(zone);
  }
  public void buyConcertTicket(VIPConcert concert) {
    System.out.println(name + " bought 1 ticket(s) in Zone VIP");
    concert.buyTicket();   
  }
}

//Tester Class
public class ConcertTester{
  public static void main(String[] args) {    
    Concert concert = new Concert("ABC Conference Center","7:00 PM");   
    concert.showDetails();
    System.out.println("--------1--------");   
    concert.addArtist("Tahsan Khan");
    concert.addArtist("Habib Wahid");   
    concert.showDetails();
    System.out.println("--------2--------");   
    Audience a1 = new Audience("Sarah");
    Audience a2 = new Audience("Alex");
    System.out.println("--------3--------");
    a1.buyConcertTicket(concert, "A", 3);    
    a2.buyConcertTicket(concert, "B");  
    System.out.println("--------4--------");
    concert.showDetails();
    System.out.println("--------5--------");
    VIPConcert vipConcert = new VIPConcert("Army Stadium","10:00 PM");
    vipConcert.addArtist("Atif Aslam");    
    Audience a3 = new Audience("Emily");
    a3.buyConcertTicket(vipConcert); 
    System.out.println("--------6--------");
    vipConcert.showDetails();
    System.out.println("--------7--------");;
    Concert.showTotalTicketsSold();
  }
}



//stars
class Concert {
  String Venue;
  String Time;
  int ticketSold;         
  String[] artists = new String[5];
  int artistCur = 0; 
  static int totalTicketsSold = 0;
  public Concert(String Venue, String time) {
    this.Venue = Venue;
    this.Time = time;
    this.ticketSold = 0;
  }
    public void showDetails() {
        System.out.println("Venue: " + Venue);
        System.out.println("Showtime: " + Time);
        System.out.println("Artist: ");
        for (int i = 0; i < artistCur; i++) {
            System.out.println("-" + artists[i]);
        }
        System.out.println("Tickets sold in this concert: " + ticketSold);
    }
    public void addArtist(String name) {
      if  (artistCur < artists.length) {
        artists [artistCur++] = name;
      }
  }
    public void buyTicket(String zone, int quantity) {
        int price = 0;
        if (zone.equals("A")) price = 500 * quantity;
        else if (zone.equals("B")) price = 1000 * quantity;

        ticketSold += quantity;
        totalTicketsSold += quantity;
        System.out.println("Total price: " + price);
    }

  public void buyTicket() {
        ticketSold += 1;
        totalTicketsSold += 1;
        System.out.println("Total price: 2000");
  }
   public void buyTicket(String zone) {
        buyTicket(zone, 1);
    }
  public static void showTotalTicketsSold() {
        System.out.println("Total tickets sold (all venues): " + totalTicketsSold);
  }
}
class VIPConcert extends Concert {
    public VIPConcert(String Venue, String time) {
        super(Venue, time);
    }
}