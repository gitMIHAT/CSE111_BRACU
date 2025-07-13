import java.util.Arrays;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] map = { //can change with any map i want;
            {0, 0, 10, 0, -1},
            {0, -1, 0, 0, -1},
            {-1, 0, -1, 0, 0},
            {0, -1, 7, 0, -1},
            {0, -1, 0, -1, 0}
        };
        int playerRow=0;
        int playerCol=0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(map[i][j]==7){
                    playerRow=i;
                    playerCol=j;
                }
            }
        }
        for (int move = 0; move < 5; move++) {
            for (int i = 0; i < map.length; i++) {
                System.out.print(Arrays.toString(map[i]));
                System.out.println();
            }
            System.out.print("Enter move (UP/DOWN/LEFT/RIGHT): ");
            String str = sc.nextLine();

            int newRow = playerRow;
            int newCol = playerCol;

            if (str.equals("RIGHT")) {
                newCol++;
            } else if (str.equals("LEFT")) {
                newCol--;
            } else if (str.equals("UP")) {
                newRow--;
            } else if (str.equals("DOWN")) {
                newRow++;
            } else {
                System.out.println("Invalid input!");
                continue;
            }
            if (newRow < 0 || newRow >= map.length || newCol < 0 || newCol >= map[0].length) {
                System.out.println("Can't move there!");
                --move;// i used this line for not cutting my move for this kind of invalid move;
                continue;
            }
            else if(map[newRow][newCol] == -1){
                System.out.println("You Land on mine");
                System.out.println("Game Over!");
                return;
            }
            else if (map[newRow][newCol] == 10) {
                map[playerRow][playerCol] = 0;
                map[newRow][newCol] = 7;
                for (int i = 0; i < map.length; i++) {
                    for (int j = 0; j < map[0].length; j++) {
                        System.out.print(map[i][j] +" ");
                    }
                    System.out.println();
                }
                System.out.println("You win!");
                return;
            }
            else if (map[newRow][newCol] == 0) {
                map[playerRow][playerCol] = 0;
                map[newRow][newCol] = 7;
                playerRow = newRow;
                playerCol = newCol;
            }
        }
        System.out.println("Game over!");
    }
}
