package cc.kevinlu.leetcode;

public class MainTest009 {
    public static void main(String[] args) {
        int a = 123;
        isPalindrome(a);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int result = 0, temp = 0,mid = x;
        while (x != 0) {
            temp = x % 10;
            result = result * 10 + temp;
            x = x / 10;
        }
        if(result == mid){
            return true;
        }else{
            return false;
        }
    }
}
