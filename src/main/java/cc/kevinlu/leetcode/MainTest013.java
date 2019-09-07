package cc.kevinlu.leetcode;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainTest013 {
    public static void main(String[] args) {
        String s = "IXLVIII";
        System.out.println(romanToInt(s));
    }
    public static  int romanToInt(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("I",1);map.put("IV",4);
        map.put("V",5);map.put("IX",9);
        map.put("X",10);map.put("XL",40);
        map.put("L",50);map.put("XC",90);
        map.put("C",100);map.put("CD",400);
        map.put("D",500);map.put("CM",900);
        map.put("M",1000);
        int sub = 0;
        for (int i = 0;i<=s.length()-1;){
            if(i<s.length()-1&&map.containsKey(s.substring(i,i+2))){
                sub = sub +map.get(s.substring(i,i+2));
                i = i + 2;
            }else{
                sub = sub +map.get(s.substring(i,i+1));
                i = i+1;
            }
        }
        return sub;
    }
}
