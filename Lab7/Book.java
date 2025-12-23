public class Book extends Product {
    public String ISBN;
    public String pub;

    public Book(int id,String name,int price,String ISBN,String pub){
        super(id,name,price);
        this.ISBN = ISBN;
        this.pub=pub;
    }
    public String printDetail(){
        return String.format(super.getIdTitlePrice()+"\nISBN: %s Publisher: %s", ISBN,pub);
    }
    

    
}
class CD extends Product{
    public String Brand;
    public int duration;
    public String genre;

    public CD(int id,String name,int price,String Brand,int duration,String genre){
        super(id,name,price);
        this.Brand=Brand;
        this.duration=duration;
        this.genre= genre;
    }
    public String printDetail(){
        return String.format(super.getIdTitlePrice()+"\nBand: %s Duration: %s minutes \nGenre: %s", Brand,duration,genre);
    }
}