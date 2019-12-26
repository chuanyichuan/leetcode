package cc.kevinlu.leetcode;

public class MainTest1281 {
    public static void main(String[] args) {
        int n = 1234;
        subtractProductAndSum(n);
    }
    public static int subtractProductAndSum(int n) {
        int sub = 1, sum = 0;
        while(n != 0){
            int temp = n % 10;
            sub = sub * temp;
            sum = sum + temp;
            n = n / 10;
        }
        return sub - sum;
    }
}