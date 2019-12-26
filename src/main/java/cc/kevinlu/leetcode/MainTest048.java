package cc.kevinlu.leetcode;

public class MainTest048 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] nums1 = {{4, 5, 6},{7, 8, 9}};
        //rotate(nums);;
    }

    public static int[][] rotate(int[][] matrix) {
        //转置
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //翻转
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j -1];
                matrix[i][n - 1 - j] = temp;
            }
        }
        return matrix;
    }
}