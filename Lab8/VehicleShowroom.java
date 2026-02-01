public class VehicleShowroom {
  public static void main(String[] args) {
    Car c1 = new Car("Toyota Camry", 25000, 4);
    System.out.println("--------1---------");
    c1.vehicleDetail();
    System.out.println("--------2---------");
    Car.showAllAvailableCars();
    System.out.println("--------3---------");
    Car c2 = new Car("Honda Civic", 22000, 4);
    Car c3 = new Car("Ford Mustang", 35000, 2);
    Car.markAsSold(c1);
    Car.markAsSold(c2);
    System.out.println("--------4---------");
    c2.vehicleDetail();
    System.out.println("--------5---------");
    Car.showAllCars();
    System.out.println("--------6---------");
    ElectricCar e1 = new ElectricCar("Tesla Model 3", 45000, 75);
    ElectricCar e2 = new ElectricCar("Nissan Leaf", 32000, 60);
    ElectricCar e3 = new ElectricCar("Nissan Leaf", 32000, 60);
    System.out.println("--------7---------");
    e1.vehicleDetail();
    System.out.println("--------8---------");
    e3.vehicleDetail();
    System.out.println("--------9---------");
    ElectricCar.markAsSoldEV(e1);
    ElectricCar.markAsSoldEV(e2);
    ElectricCar.markAsSoldEV(e3);
  }
}

class Vehicle {
  public String model;
  public int price;
  public boolean sold;
  public String vehicleId; 
  public Vehicle(String model, int price) {
    this.model = model;
    this.price = price;
    this.sold = false;
    this.vehicleId = "";
  } 
  public void vehicleDetail() {
    System.out.println("Model: " + model + ", Price: $" + price);
    System.out.print("Status: ");
    if(sold){
      System.out.print("Sold\n");
    }
    else{
      System.out.print("Available\n");
    }
  }
}

//starts
class ElectricCar extends Vehicle{
    public int betterCap;
    public String type;
    public ElectricCar(String model,int price,int betteryCap){
        super(model,price);
        this.betterCap=betteryCap;
        vehicleId="EV000";
        type="Electric Vehicle";
        System.out.printf("Vehicle ID: %s created\n",vehicleId);
    }
    @Override
     public void vehicleDetail() {
        super.vehicleDetail();
        System.out.println("Type: "+type+"\nBettery Capacity: "+betterCap+" kWh");
     }    
    //static method
    public static void markAsSoldEV(ElectricCar obj){
        obj.sold = true;
    } 
}
class Car extends Vehicle{
    public int seats;
    public String type;
    public static int totalCar=0;
    public static int index;
    public String status="available";
    public static Car [] cars = new Car[1000];
    //static 
    public Car(String model,int price ,int seats){
        super(model,price);
        vehicleId= "Car00"+(totalCar+1);
        Car.cars[totalCar] =this; 
        this.seats = seats;
        totalCar++;
        type ="Regular Car";
        vehicleId = "Car00"+totalCar;
        System.out.printf("Vehicle ID: %s created\n",vehicleId);
    }
    @Override
     public void vehicleDetail() {
        super.vehicleDetail();
        System.out.println("Type: "+type+"\nSeats: "+seats);
     }

     //staticM
     public static void showAllAvailableCars(){
        System.out.println("Total Car: "+totalCar+"\nAvailable Cars:");
        for(int i=0;i<totalCar;i++){
            System.out.println( cars[i].vehicleId+" : "+cars[i].model);
        }
     }
     public static void markAsSold(Car obj){
        obj.sold = true;
     }
     public String soldStatus(){
        if(sold ==true){
            status="sold";
        }
        return status;
     }
     public static void showAllCars(){
        System.out.println("Total Car: "+totalCar);
        for(int i=0;i<totalCar;i++){
            System.out.println(cars[i].vehicleId+" : "+cars[i].model +" - "+cars[i].soldStatus());
        }

     }
}