public class Product {
    public String prodName;
    public int Qty;
    public static Product[] prodArr = new Product[3];
    public static int index = 0;

    public Product(String Product, int Q){
        prodName = Product;
        Qty = Q;
        if(index < prodArr.length){
            System.out.println("Stored: " + prodName);
            prodArr[index++] = this;
        } else {
            System.out.println("Storage is full! Cannot add " + prodName);
        }
    }

    public static void displayProducts(){
        System.out.println("=== Stored Products ===");
        for(int i = 0; i < index; i++){
            System.out.println(prodArr[i].prodName + " - Qty: " + prodArr[i].Qty);
        }
    }

    public static void buy(String name, int quan){
        for(int i = 0; i < index; i++){
            if(prodArr[i].prodName.equals(name)){
                if(prodArr[i].Qty >= quan){
                    prodArr[i].Qty -= quan;
                    System.out.println("Product Sold");
                } else {
                    System.out.println("Quantity low");
                }
                return;
            }
        }
        System.out.println("Product not found");
    }
}
