package cc.kevinlu.leetcode;

public class MainTest263 {
    public static void main(String[] args) {
        isUgly(4);
    }
    public static boolean isUgly(int num) {
        if(num == 0) return false;
        if(num == 1) return true;
        if(num % 2 == 0){
            num = num / 2;
            isUgly (num);
        }
        if(num % 3 == 0){
            num = num / 3;
            isUgly(num);
        }
        if(num % 5 == 0){
            num = num / 5;
            isUgly(num);
        }
        return false;
    }
}