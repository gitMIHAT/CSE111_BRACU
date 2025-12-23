

public class Cart {
    public double TotalPrice;
    public double [] prices =new double[3];
    public String [] items=new String[3];
    public int index;
    public double discount;
    public String cartName;
    public int cartNum;

    public void cartDetails(){
        System.out.println("Your "+cartName +" :");
        for(int i=0;i<index;i++){
            System.out.println( items[i] +" - "+prices[i]);
        }
        System.out.println("Discount Applied: "+ discount +"%");
        System.out.println("Total price: "+TotalPrice);
    }
    public void addItem(String s,double p){
        if(index<items.length){
            items[index]=s;
            prices[index++]=p;
            TotalPrice += p;
            System.out.println(s+" added to cart "+cartNum);
            System.out.println("You have "+index +" item(s) in your cart now.");
        }else{
            System.out.println("You have already 3 items in your cart now.");
        }
    }
    public void addItem(double p,String s){
        this.addItem(s, p);
    }
    public void create_cart(int n){
        cartName ="Cart(c"+n+")";
        cartNum=n;
    }
    public void giveDiscount(int a){
        discount =a;
        TotalPrice = TotalPrice -(TotalPrice * a/100);
    }
}