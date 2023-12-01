package Assignment;
import java.util.Scanner;

public class IsConnected {
    public static boolean isConnected(int[][] adjMatrix){
        boolean[] visited = new boolean[adjMatrix.length];
        DFS(adjMatrix,0,visited);

        for(boolean elem:visited){
            if(!elem)
                return false;
        }
        return true;
    }
    public static void  DFS(int[][] adjMatrix,int startver,boolean[] visited){
        visited[startver]=true;
        for(int i=0;i<adjMatrix.length;i++){
            if(adjMatrix[startver][i]==1 && !visited[i]){
                visited[i]=true;
                DFS(adjMatrix,i,visited);
            }
        }
        return;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        if(n == 0){
            System.out.println(true);
        }

        int[][] adjMatrix = new int[n][n];
        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        } 
        sc.close();
    
        System.out.println(isConnected(adjMatrix));
    }
}