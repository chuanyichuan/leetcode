package cc.kevinlu.leetcode;

public class MainTest063 {
    public static void main(String[] args) {
        int[][] temp = {{1},{0}};
        uniquePathsWithObstacles(temp);
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] temp = obstacleGrid;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[0][0] != 1){
            temp[0][0] = 1;
        }else{
            temp[0][0] = 0;
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j != 0){
                    if(temp[i][j] == 1){
                        temp[i][j] = 0;
                    }else{
                        temp[i][j] = temp[i][j - 1];
                    }
                }
                if(i != 0 && j == 0){
                    if(temp[i][j] == 1){
                        temp[i][j] = 0;
                    }else{
                        temp[i][j] = temp[i - 1][j];
                    }
                }
                if(i != 0 && j != 0){
                    if(temp[i][j] == 1){
                        temp[i][j] = 0;
                    }else{
                        temp[i][j] = temp[i -1][j] + temp[i][j -1];
                    }
                }
            }
        }
        return temp[m - 1][n - 1];
    }
}