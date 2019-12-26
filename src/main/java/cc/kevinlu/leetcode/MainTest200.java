package cc.kevinlu.leetcode;

public class MainTest200 {
    public static void main(String[] args) {
        char[][] nums = {{'1','1','0','0','0'}, {'1','1','0','0','0'},
                {'0','0','1','0','0'}, {'0','0','0','1','1'}};
        numIslands(nums);
    }
    public static int numIslands(char[][] grid) {
        if(grid.length == 0)return 0;
        int row = grid.length;
        int column = grid[0].length;
        int ans = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(grid[i][j] == '1'){
                    ans++;
                    dfs(grid, i, j);
                }
            }
        }
        return ans;
    }

    private static void dfs(char[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i == grid.length || j == grid[0].length){
            return;
        }
        if(grid[i][j] != '1'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);

    }

}