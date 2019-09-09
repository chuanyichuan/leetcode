package cc.kevinlu.leetcode;

public class MainTest342 {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPowerOfFour(num));
    }

    public static int solution(int n) {
        int temp = 1;
        while (n > 0) {
            temp = temp * 4;
            n--;
        }
        return temp;
    }
    public static boolean isPowerOfFour(int num) {
        int len = Integer.toBinaryString(num).length();
        if (num == solution((len-1)/2))return true;
        return false;
    }
}
