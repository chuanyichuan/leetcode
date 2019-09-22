package cc.kevinlu.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainTest008 {
    public static void main(String[] args) {
        String str = "    -111   -123";
        System.out.println(myAtoi(str));
    }

    public static int myAtoi(String str) {
        str = str.trim();
        String regex = "^[\\+\\-]?\\d+";//正则匹配
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while (m.find()) {
            int start = m.start();//匹配开始处
            int end = m.end();//匹配结束处
            String string = str.substring(start,end);
           try{
               return Integer.valueOf(string);
           } catch (Exception e){
               if(string.charAt(0)=='-'){
                   return Integer.MIN_VALUE;
               }else{
                   return Integer.MAX_VALUE;
               }
           }
        }
        return 0;
    }
}
