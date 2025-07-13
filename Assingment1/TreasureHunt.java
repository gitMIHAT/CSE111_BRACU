import java.util.Scanner;
public class TreasureHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2D = {
            {0, 0, 10, 0, -1},
            {0, -1, 0, 0, -1},
            {-1, 0, -1, 0, 0},
            {0, -1, 7, 0, -1},
            {0, -1, 0, -1, 0}
        };
        System.out.println("Initial Map:");
        printMap(arr2D);
        int row_pos = -1, col_pos = -1;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[0].length; j++) {
                if (arr2D[i][j] == 7) {
                    row_pos = i;
                    col_pos = j;
                }
            }
        }
        int turns = 5;
        while (turns > 0) {
            System.out.printf("Enter move %d (UP/DOWN/LEFT/RIGHT): ", (6 - turns));
            String inp = sc.nextLine().toUpperCase();

            int new_row = row_pos;
            int new_col = col_pos;

            if (inp.equals("UP")) {
                new_row--;
            } else if (inp.equals("DOWN")) {
                new_row++;
            } else if (inp.equals("LEFT")) {
                new_col--;
            } else if (inp.equals("RIGHT")) {
                new_col++;
            } else {
                System.out.println("Invalid input!");
                continue;
            }
            if (new_row < 0 || new_row >= arr2D.length || new_col < 0 || new_col >= arr2D[0].length) {
                System.out.println("Can't move there! Out of bounds.");
                continue;
            }
            if (arr2D[new_row][new_col] == -1) {
                System.out.println("You landed on a mine! Game Over.");
                return;
            }
            if (arr2D[new_row][new_col] == 10) {
                arr2D[row_pos][col_pos] = 0;
                arr2D[new_row][new_col] = 7;
                printMap(arr2D);
                System.out.println("Congratulations! You found the treasure!");
                return;
            }
            arr2D[row_pos][col_pos] = 0;
            arr2D[new_row][new_col] = 7;
            row_pos = new_row;
            col_pos = new_col;

            System.out.println("Current state:");
            printMap(arr2D);

            turns--;
        }
        if (turns == 0) {
            System.out.println("Failed to find the treasure.");
        }
    }


    public static void printMap(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
