package cc.kevinlu.leetcode;

public class MainTest062 {
    public static void main(String[] args) {

    } public int uniquePaths(int m, int n) {
        if(m == 0 || n == 0) return 0;
        int[][] temp = new int[m][n];
        temp[0][0] = 1;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j != 0){
                    temp[i][j] = temp[i][j - 1];
                }
                if(i != 0 && j == 0){
                    temp[i][j] = temp[i - 1][j];
                }
                if(i != 0 && j != 0){
                    temp[i][j] = temp[i -1][j] + temp[i][j -1];
                }
            }
        }
        return temp[m - 1][n - 1];
    }

}