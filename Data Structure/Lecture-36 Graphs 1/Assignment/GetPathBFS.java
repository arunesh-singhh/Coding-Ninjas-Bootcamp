package Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GetPathBFS {
    private static ArrayList<Integer> getPath(int[][] adjMatrix, boolean[] visited, int start, int end) {
        if (start == end) {
            ArrayList<Integer> arrList = new ArrayList<>();
            arrList.add(start);
            return arrList;
        }
        
        Queue<Integer> pendingVertices = new LinkedList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        pendingVertices.add(start);
        visited[start] = true;

        while(!pendingVertices.isEmpty() ){
            int first = pendingVertices.remove();
            for(int i=0; i<adjMatrix.length; i++){
                if(adjMatrix[first][i] == 1 && !visited[i]){
                    visited[i] = true;
                    pendingVertices.add(i);
                    map.put(i,first);
                    if(i == end){    
                        ans.add(i); 
                        while(!ans.contains(start)){
                            int b = map.get(i);
                            ans.add(b);
                            i = b;
                        }
                        return ans;
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        // take input of adjMatrix and mark 1 in matrix
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