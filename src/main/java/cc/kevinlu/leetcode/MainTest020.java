package cc.kevinlu.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MainTest020 {
    public static void main(String[] args) {
        String s = "]";
        isValid(s);
    }

    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (!stack.empty()) {
                    if(stack.peek() == map.get(s.charAt(i))){
                        stack.pop();
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        if(stack.empty()){
            return true;
        }else{
            return  false;
        }
    }
    /*public static boolean isValid(String s) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"()");
        map.put(2,"[]");
        map.put(3,"{}");

        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<s.length(); i++){
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            }
        }
        for(int j = 0;j<sb.length()-1;){
            String str = sb.substring(j,j+2);
            if(map.containsValue(str)){
                j = j+2;
            }else{
                return false;
            }
        }
        return true;
    }*/
}
