import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number N: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < len; i++) {
            boolean counted = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    counted = true;
                    break;
                }
            }
            if (counted ==false) {
                int count = 1;
                for (int k = i + 1; k < len; k++) {
                    if (arr[i] == arr[k]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " - " + count + " times");
            }
        }
    }
}
