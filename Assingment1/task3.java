import java.util.Arrays;
import java.util.Scanner;
public class task3{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of array");
        int len = sc.nextInt();
        int []arr = new int [len];
        for ( int i = 0;i<len;i++){
            arr[i] =sc.nextInt();
        }
        for (int i= 0;i<Math.sqrt(len);i++){
            int temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len -i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}