package cc.kevinlu.leetcode;

import java.util.Arrays;

public class MainTest242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        isAnagram(s, t);
    }

    /**
     * 超时
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram(String s, String t) {
        if(s.length() == 0 || t.length() == 0) return false;
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        String temp = "";
        String ans = "";
        for(int i = 0; i < schar.length; i++) {
           temp += schar[i];
        }
        for(int j = 0; j < tchar.length; j++) {
            ans += tchar[j];
        }
        if(temp.equals(ans)) {
            return true;
        }else{
            return false;
        }
    }
}