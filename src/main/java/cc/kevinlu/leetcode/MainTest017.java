package cc.kevinlu.leetcode;

import javax.swing.tree.TreeNode;
import java.util.*;

public class MainTest017 {
    public static void main(String[] args) {
        //letterCombinations("34");
        //com("23");
        /*Integer a = 1111111;
        Integer b = 1111111;
        System.out.println(a.equals(b));
        System.out.println(a == b);*/
    }
   public static  List<String> letterCombinations(String digits) {
       LinkedList<String> ans = new LinkedList<>();
       if(digits.isEmpty()) return ans;
       String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
       ans.add("");
       for(int i =0; i<digits.length();i++){
           int x = Character.getNumericValue(digits.charAt(i));
           while(ans.peek().length()==i){
               String t = ans.remove();
               for(char s : mapping[x].toCharArray())
                   ans.add(t+s);
           }
       }
       return ans;
   }
   public static List<String> com(String digits){
        String[] code = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> states = new ArrayList<>();
        states.add("");
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        for(char i : digits.toCharArray()){
            List newStates = new ArrayList<>();
            String build = code[Integer.parseInt(String.valueOf(i))-2];
            for(char j : build.toCharArray()){
                for(String k : states){
                   newStates.add(k + j);
                }
            }
            states = newStates;
       }
        return states;
   }
}
