package cc.kevinlu.leetcode;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainTest125 {
    public static void main(String[] args) {
        String a="A man, a plan, a canal: Panama";
        isPalindrome(a);
    }
    public static boolean isPalindrome(String s) {

        String regex = "[^0-9a-zA-Z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher macher = pattern.matcher(s);
        String str = macher.replaceAll("").trim();
        str = str.toLowerCase();
        StringBuffer sb = new StringBuffer(str);
        StringBuffer resb = sb.reverse();
        if(str.equals(resb.toString())){
            return true;
        }else{
            return false;
        }
    }

}
