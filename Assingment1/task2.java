import java.util.Scanner;
public class task2{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        String inStr = sc.nextLine();
        int len = inStr.length();
        for(int i =0;i< len;i++){
            char ch = inStr.charAt(i);
            if(ch =='a' ){
                System.out.println("z");
            }
            else{
                char nch = (char)(ch-1);
                System.out.println(nch);
            }
        }
    }
}