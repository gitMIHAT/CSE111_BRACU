public class CellPhone {
    public String model ="unknown";
    public int contact;
    public String [] arr=new String [3];



    public void printDetails() {
        System.out.println("Phone model "+model);
        System.out.println("Contact Stored : "+contact);
    }
    public void storeContact(String str){
        if(contact <3)
        arr[contact++]=str;
        System.out.println("Contact Stored");
    }
}