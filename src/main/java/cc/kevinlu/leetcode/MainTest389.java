package cc.kevinlu.leetcode;

public class MainTest389 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "abce";
        findTheDifference(s,t);
    }
    public static char findTheDifference(String s, String t) {
        int temp = 0,sub = 0;
        for(int i = 0; i<s.length();i++){
            sub = sub +s.charAt(i);
        }
        for(int i = 0; i<t.length();i++){
            temp = temp +t.charAt(i);
        }
        char result = (char) (temp-sub);
        return result;
    }
}
