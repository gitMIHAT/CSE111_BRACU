public class UberEatsUser {
    public String usrname;
    public String location ="Unknown";
    public Boolean updated =false;
    public UberEatsUser(String name ,String Location){
        this.usrname =name;
        this.location =Location;
    }
    public UberEatsUser(String name){
        this.usrname= name;
    }

    public void updateLocation(String Location){
        if(updated ==false){
            updated = true;
            location =Location;
            System.out.println("Update Successful!");
        }else{
            System.out.println("We already have your location.\nPlease place an order!");
        }
    }
}
