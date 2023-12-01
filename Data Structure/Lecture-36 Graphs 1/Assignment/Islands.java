package Assignment;
import java.util.Scanner;

public class Islands {

    public static void DFTraversal(int[][] adjMatrix, int curentVertes, boolean[] visited){
        visited[curentVertes] = true;

        for (int i = 0; i < visited.length; i++) {
            if (adjMatrix[curentVertes][i] == 1 && visited[i] == false) {
                DFTraversal(adjMatrix, i, visited); 
            }
        }
	}
    
    public static int DFTraversal(int[][] adjMatrix, int n) {
        boolean visited[] = new boolean[n];
        int count = 0;
       
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                DFTraversal(adjMatrix, i, visited);
                count++;
            }
        }
        return count;
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
        System.out.println(DFTraversal(adjMatrix, n));
    }
}
