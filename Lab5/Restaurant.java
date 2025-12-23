public class Restaurant {
    public String resName;
    public String resLocation;
    public UberEatsUser [] orders = new UberEatsUser[3];
    public int index;
    public Boolean ordered= false;
    public Restaurant(String name ,String Location){
        resName = name;
        resLocation = Location;
    }

    public void takeOrder(UberEatsUser obj){
        for(int i=0;i<index;i++){
            if(orders[i]==obj){
                ordered =true;
                System.out.println("You already have a pending order!");
                break;
            }
        }
        if(ordered ==false){
            if(orders.length>index){
                if(obj.location =="Unknown"){
                    System.out.println("Location : "+obj.location+". Please update your location information!");
                }else{
                    System.out.println("Your order has been added!");
                    orders[index++]= obj;
                }
            }else{
                System.out.println("We are really busy right now.\nPlease order after sine time.\nThank you!");
            }
        }
    }
    public void completeOrders(){
        if(orders[0] ==null ){
            System.out.println("No pending orders at the moment.");
        }else{
            System.out.println("Showing "+resName+"'s orders:");
            for (int i=0;i<index;i++){
                System.out.println("Order by "+orders[i].usrname +" at "+orders[i].location +" completed");
            }
            orders = new UberEatsUser[3];
        }
    }
}
