package cc.kevinlu.leetcode.myTest;

import java.util.regex.Pattern;

public class PatternMacher {
    public static void main(String[] args) {
        String regexp = "^[\u4E00-\u9FA5A-Za-z0-9_.()]+$";
        String content = "()sdaf_a.sd.()";
        boolean isMatch = Pattern.matches(regexp, content);
        System.out.println(isMatch);
    }
}
