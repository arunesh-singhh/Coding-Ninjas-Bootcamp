public class RatInMazeAllPath {

    static void ratInAMaze(int maze[][], int n) {
        int[][] path = new int[n][n];
        printMaze(maze, path, 0, 0, n);
    }
 
    public static void printMaze(int[][] maze, int[][] path, int x, int y, int n){
        if (x > n - 1 || x < 0 || y > n - 1 || y < 0 || maze[x][y] == 0 || path[x][y] == 1){
            return;
        }
        path[x][y] = 1;
        if (x == n - 1 && y == n - 1){
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    System.out.print(path[i][j] + " ");
                }
            }
            path[x][y] = 0;
            System.out.println();
            return;
        }
        printMaze(maze, path, x - 1, y, n);
        printMaze(maze, path, x + 1, y, n);
        printMaze(maze, path, x, y - 1, n);
        printMaze(maze, path, x, y + 1, n);
        path[x][y] = 0;
    }
     
    // public static void ratInAMaze(int[][] maze){
    //     int n = maze.length;
    //     int[][] path = new int[n][n];
    //     printMaze(maze, 0, 0, path);
    // }

    // public static void printMaze(int[][] maze, int i, int j, int[][] path){
    //     int n = maze.length;
    //     // check i, j cell is valid or not
    //     if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
    //         return;
    //     }
    //     // include the cell in current path
    //     path[i][j] = 1;
    //     // destination cell
    //     if (i == n-1 && j == n-1) {
    //         for (int r = 0; r < path.length; r++) {
    //             for (int c = 0; c < path.length; c++) {
    //                 System.out.print(path[r][c] + " ");
    //             }
    //         }
    //         path[i][j] = 0;
    //         System.out.println();
    //         return;
    //     }

    //     // explore further in all directions
    //     // top
    //     printMaze(maze, i - 1, j, path);
    //     // right
    //     printMaze(maze, i, j + 1, path);
    //     // down
    //     printMaze(maze, i + 1, j, path);
    //     // left
    //     printMaze(maze, i, j - 1, path);
    //     path[i][j] = 0;
    //     return;

    // }

    public static void main(String[] args) {
        int n = 3;
        int maze[][] = {{1, 1, 0}, {1, 1, 0}, {1, 1, 1}};
        ratInAMaze(maze, n);
    }
}