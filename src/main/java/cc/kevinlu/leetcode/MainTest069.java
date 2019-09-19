package cc.kevinlu.leetcode;

public class MainTest069 {
    public static void main(String[] args) {
       Solution k = new Solution();
        System.out.println(k.mySqrt(19));
    }
}
class Solution {
    int s;
    public int mySqrt(int x) {
        s=x;
        if(x==0) return 0;
        return ((int)(sqrts(x)));
    }
    public double sqrts(double x){
        double result = (x + s / x) / 2;
        if (result == x) {
            return x;
        } else {
            return sqrts(result);
        }
    }
}
