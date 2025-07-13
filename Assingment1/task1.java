import java.util.*;
public class task1{
    public static void main(String[]args){
        Scanner mk = new Scanner(System.in);
        int shuru = mk.nextInt();//start point denoted as shuru
        int sesh = mk.nextInt();// end point== sesh
        int count =0;
        for(int m = shuru;m<sesh;m++){
            boolean found = false;
            for(int j =2;j<= Math.sqrt(m);j++){
                if(m%j==0){
                    found =true;
                    break;
                }
            }
            if(found ==false){
                count++;
            }
        }
        System.out.println("prime numbers between " +shuru + " and "+ sesh +" is :"+ count);
    }
}