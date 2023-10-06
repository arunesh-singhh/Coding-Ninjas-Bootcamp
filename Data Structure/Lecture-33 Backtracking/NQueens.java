import java.util.Scanner;

public class NQueens {
    public static void placeNQueens(int n){
	    int[][] board = new int[n][n];
        placeQueens(board, 0, n);
    }

    private static void placeQueens(int[][] board, int row, int n) {
        // valid board configuration
        if (n == row) {
            print2dArray(board);
        }
        // check for all columns
        for (int j = 0; j < n; j++) {
            // check if it is safe to place Queen
            if (isBoardSafe(board, row, j)) {
                board[row][j] = 1;
                // if it is safe -> then place the queen & move to next row
                placeQueens(board, row + 1, n);
                board[row][j] = 0;
            }
        }
    }

    private static boolean isBoardSafe(int[][] board, int row, int column) {
        int n = board.length;
        // check for upper left corner
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        // check for upper right corner
        for (int i = row - 1, j = column + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        // check for top
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][column] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void print2dArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the board: ");
        int size = scan.nextInt();
        scan.close();
        if (size > 3) {
            placeNQueens(size);
        } else {
            System.out.println("Size is less than 4! No placement of Queen is possible :(");
        }
    }
}
