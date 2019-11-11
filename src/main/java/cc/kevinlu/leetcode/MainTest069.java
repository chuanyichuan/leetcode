package cc.kevinlu.leetcode;

public class MainTest069 {
    public static void main(String[] args) {
        mySqrt(4);
    }
    public static int mySqrt(int x) {
        return binary(0, x, x);
    }
    public static int binary(int left, int right, int target){
        int middle = (left + right)/2;
        if(Math.pow(middle,2) <= target && target < Math.pow(middle + 1, 2)){
            return middle;
        }
        if(Math.pow(middle, 2) < target){
            return binary(middle + 1, right, target);
        }else {
           return binary(left, middle - 1, target);
        }
    }
}