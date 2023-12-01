package Assignment;

public class LargestPeace {

    static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public static int dfs(String[] edge, int n) {
        boolean[][] visited = new boolean[n][n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == false && edge[i].charAt(j) == '1') {
                    ans = Math.max(ans, dfs(edge, visited, i, j, n));
                }
            }
        }
        return ans;
    }

    private static int dfs(String[] edge, boolean[][] visited, int x, int y, int n) {
        visited[x][y] = true;
        int count = 1;

        for (int i = 0; i < 4; i++) {
            int nex = x + dir[i][0];
            int ney = y + dir[i][1];
            if (nex>=0 && ney>=0 && nex<n && ney<n && edge[nex].charAt(ney) == '1' && visited[nex][ney] == false) {
                count += dfs(edge, visited, nex, ney, n);
            }
        }
        return count;
    }
}
