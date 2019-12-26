package cc.kevinlu.leetcode;

public class MainTest064 {
    public static void main(String[] args) {

    }
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i =0 ; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 && j != 0){
                    grid[i][j] = grid[i][j] + grid[i][j - 1];
                }
                if(i != 0 && j == 0){
                    grid[i][j] = grid[i][j] + grid[i - 1][j];
                }
                if(i != 0 && j != 0){
                    grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
                }
            }
        }
        return grid[n - 1][m - 1];
    }
}