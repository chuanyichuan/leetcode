package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MainTest054 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        spiralOrder(nums);
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        if(matrix.length == 0) return ans;
        int m = matrix[0].length;
        int left = 0, right = m - 1, top = 0, bottom = n-1;
        while (ans.size() < n * m){
            //右
            for (int i = left; i <= right; i++){
                ans.add(matrix[left][i]);
            }
            top++;
            //下
            if(ans.size() < n * m){
                for(int j = top; j <= bottom; j++){
                    ans.add(matrix[j][right]);
                }
                right--;
            }
            //左
            if(ans.size() < n * m){
                for (int k = right; k >= left; k--){
                    ans.add(matrix[bottom][k]);
                }
                bottom--;
            }
            //上
            if(ans.size() < n * m){
                for (int p = bottom; p > left; p--){
                    ans.add(matrix[p][left]);
                }
                left++;
            }
        }
        return ans;

    }
}