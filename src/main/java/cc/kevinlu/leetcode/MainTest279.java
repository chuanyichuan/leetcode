package cc.kevinlu.leetcode;

public class MainTest279 {
    public static void main(String[] args) {

    }
    public int numSquares(int n) {
        if(n == 0) return 0;
        int[] temp = new int[n + 1];
        for(int i = 1; i <= n; i++){
            temp[i] = i;
            for(int j = 1; i - j * j >= 0; j++){
                temp[i] = Math.min(temp[i], temp[i - j * j] + 1);
            }
        }
        return temp[n];
    }
}