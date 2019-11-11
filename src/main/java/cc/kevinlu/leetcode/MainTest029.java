package cc.kevinlu.leetcode;

import java.util.ArrayList;

public class MainTest029 {
    public static void main(String[] args) {
       // divide(-7,-1);
        System.out.println(divide(-2147483648
                ,1));
    }
    public static int divide(int dividend, int divisor) {
        boolean temp = dividend > 0 && 0 > divisor;
        boolean sub = divisor > 0 && 0 > dividend;
        boolean result = temp ||sub;
        int a = result ? -1 : 1;
        long dend = Math.abs((long)dividend);
        long sor = Math.abs((long)divisor);
        long res = 0;
        while (dend >= sor){
            long p = 1, t = sor;
            while (dend > (t << 1)) {
                t <<= 1;
                p <<= 1;
            }
            res += p;
            dend -= t;
        }
        return res > Integer.MAX_VALUE && divisor<0 ? Integer.MAX_VALUE : (int)res*a;
    }
}
