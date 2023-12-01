import java.util.Scanner;

public class DefthFirstTraversal {

    public static void DFTraversal(int[][] adjMatrix, int curentVertes, boolean[] visited){
        System.out.print(curentVertes + " ");
        visited[curentVertes] = true;

        for (int i = 0; i < visited.length; i++) {
            if (adjMatrix[curentVertes][i] == 1 && visited[i] == false) {
                DFTraversal(adjMatrix, i, visited); 
            }
        }
    }

    public static void DFTraversal(int[][] adjMatrix){
        boolean visited[] = new boolean[adjMatrix.length];
        DFTraversal(adjMatrix, 0, visited);
        // for disconnected graph
        for (int i = 0; i < adjMatrix.length; i++) {
            if (!visited[i]) {
                DFTraversal(adjMatrix, i, visited);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        int[][] adjMatrix = new int[n][n];
        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        } 
        sc.close();
        DFTraversal(adjMatrix);
    }
}
