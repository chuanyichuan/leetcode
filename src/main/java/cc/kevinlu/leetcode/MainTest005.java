package cc.kevinlu.leetcode;

import java.util.ArrayList;

public class MainTest005 {
    public static void main(String[] args) {
        String s = "cbbd";
        //longestPalindrome(s);
        violence(s);
    }

    /**
     *
     *中心拓展法
     *
     */
    public static String longestPalindrome(String s) {
        if (s.length() == 0) return "";
        int result = 0, start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int odd = palinDrome(s, i, i);
            int even = palinDrome(s, i, i + 1);
            int temp = odd > even ? odd : even;
            if(result < temp){
                result = temp;
                start = i - (result - 1) / 2;
                end = i + result / 2;
            }
        }
        return s.substring(start, end+1);
    }

    public static int palinDrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
    /**
     * 暴力法
     */
     public static ArrayList<String> violence(String s){
         ArrayList<String> ans = new ArrayList<>();
         for (int j = 0; j < s.length(); j++){
             for (int i = j+1; i <= s.length(); i++){
                 if(valid(s.substring(j, i))) {
                     ans.add(s.substring(j, i));
                 }
             }
         }
        return ans;
     }
     public static boolean valid(String s){
         //验证是不是回文
         if(new StringBuffer(s).reverse().toString().equals(s)) return true;
         return false;
     }
}
