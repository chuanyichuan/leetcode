package cc.kevinlu.leetcode;

public class MainTest070 {
    public static void main(String[] args) {
        climbStairs(4);
        stairs(4);
    }
    //递归有重复计算耗时较长
    public static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairs(n-1) + climbStairs(n-2);
    }
    //实际上是一组斐波那契额数
    public static int stairs(int n){
        if (n == 1){
            return 1;
        } else if(n == 2){
            return 2;
        }else{
            int i = 1;
            int j = 2;
            int k = 3;
            while (k <= n){
                int ans = i + j;
                i = j;
                j = ans;
                k++;
            }
            return j;
        }
    }
}