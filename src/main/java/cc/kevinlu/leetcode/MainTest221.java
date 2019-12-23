package cc.kevinlu.leetcode;

public class MainTest221 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int c = 1;
    }

    public int maximalSquare(char[][] matrix) {
        if (matrix.length <= 0){
            return 0;
        }
        int row = matrix.length, col = matrix[0].length;
        int [][] dp = new int[row + 1][col + 1];
        int ans = 0;
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                if(matrix[i - 1][j - 1] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i - 1][ j - 1], dp[i - 1][j]), dp[i][j - 1]) + 1;
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }
        return ans * ans;
    }

}