public class MinCostRecursive {
    public static int minCost(int[][] cost, int i, int j){
        int m = cost.length;
        int n = cost[0].length;
        
        // special case
        if (i == m-1 && j == n-1) {
            return cost[i][j];
        }
        // base case
        if (i >= m || j >= n) {
            return Integer.MAX_VALUE;
        }

        int ans1 = minCost(cost, i+1, j);
        int ans2 = minCost(cost, i, j+1);
        int ans3 = minCost(cost, i+1, j+1);

        int ans = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
        return ans;
    }
    public static void main(String[] args) {
        int[][] cost = {{1, 5, 11}, {8, 13, 12}, {2, 3, 7}, {15, 16, 18}};

        int ans = minCost(cost, 0, 0);
        System.out.println(ans);
    }
}