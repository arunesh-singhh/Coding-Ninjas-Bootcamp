package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class GetPathDFS {
    
    private static ArrayList<Integer> getPath(int[][] adjMatrix, boolean[] visited, int start, int end) {
        if (start == end) {
            ArrayList<Integer> arrList = new ArrayList<>();
            arrList.add(start);
            return arrList;
        }
        
        visited[start] = true;
        for(int i=0; i<adjMatrix.length; i++){
            if(adjMatrix[start][i] == 1 && !visited[i]){ 
                ArrayList<Integer> arr = getPath(adjMatrix, visited, i, end); 
                if(arr != null){
                    arr.add(start);
                    return arr;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        // take input of edges and mark 1 in matrix
        int[][] adjMatrix = new int[v][v];
        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }

        // take input of start and end vertices
        int start = sc.nextInt();
        int end = sc.nextInt();

        // make visited array
        boolean[] visited = new boolean[v];

        // call getpath function which return Arraylist of path
        ArrayList<Integer> ans =  getPath(adjMatrix, visited, start, end);
        if(ans!=null){
            for(int elem:ans){
                System.out.print(elem+" ");
            }
        }
        sc.close();
	}
}