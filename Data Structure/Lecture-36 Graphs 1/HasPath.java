import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HasPath {

    // using Bredth First Traversal
	public static boolean BFTraversal(int[][] adjMatrix, int start, int end){
        if (start > (adjMatrix.length - 1) || end > (adjMatrix.length - 1) ){
            return false;
        }
        if(adjMatrix[start][end] == 1) {
            return true;
        }

        Queue<Integer> pendingVertices = new LinkedList<>();
        boolean visited[] = new boolean[adjMatrix.length];
        visited[start] = true;
        pendingVertices.add(start);

        while (!pendingVertices.isEmpty()) {
            int curentVertes = pendingVertices.poll();
			if (curentVertes == end) {
				return true;
			}
            for (int i = 0; i < adjMatrix.length; i++) {
                if(adjMatrix[curentVertes][i] == 1 && !visited[i]){
                    // i is unvisited neighbor of currentVertex
                    pendingVertices.add(i);
                    visited[i] = true;
                }
            }
        }
		return false;
    }


    // using Defth First Traversal
    public static boolean DFTraversal(int[][] adjMatrix, int start, int end, boolean[] visited){
        visited[start] = true;
        for (int i = 0; i < adjMatrix.length; i++) {
            if (adjMatrix[start][i] == 1 && visited[i] == false) {
				if (i == end) {
			        return true;
		        }
                if(DFTraversal(adjMatrix, i, end, visited)){
                    return true;
                }
            }
        }
        return false ;
    }

    public static boolean DFTraversal(int[][] adjMatrix, int start, int end){
        boolean visited[] = new boolean[adjMatrix.length];
        return DFTraversal(adjMatrix, start, end, visited);
    }


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int[][] adjMatrix = new int[v][v];
        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        } 
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
        sc.close();
        System.out.println(BFTraversal(adjMatrix, v1, v2));
        System.out.println(DFTraversal(adjMatrix, v1, v2));
	}
}