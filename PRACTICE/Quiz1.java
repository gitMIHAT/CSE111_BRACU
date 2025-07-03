
import java.util.Arrays;
import java.util.Scanner;

public class Quiz1{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] [] arr= {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < arr.length; i++) {
            int add=0;
            for (int j = 0; j < arr[0].length; j++) {
                if(i<j){
                    add += arr[i][j];
                }
                else if(i>j){
                    add -= arr[i][j];
                }
            }
            arr[i][i] =add;
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
