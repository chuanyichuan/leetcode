package cc.kevinlu.leetcode;

import java.util.HashSet;

public class MainTest202 {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n){
        HashSet<Integer> set = new HashSet<>();
        return isHappySet(n, set);
    }
    public static boolean isHappySet(int n, HashSet set){
        int temp = 0;
        while(n != 0){
            temp += Math.pow(n % 10, 2);
            n = n /10;
        }
        if(temp == 1){
            return true;
        }else{
            if(!set.contains(temp)) {
                set.add(temp);
            }else{
                return false;
            }
            return isHappySet(temp, set);
        }
    }
}