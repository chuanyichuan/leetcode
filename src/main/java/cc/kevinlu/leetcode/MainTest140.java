package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainTest140 {
    static HashMap<String, List<String>> hashMap = new HashMap<>();
    public static void main(String[] args) {
        String s = "abc";
        List<String> nums = new ArrayList<>();
        nums.add("a");
        nums.add("b");
        nums.add("ab");
        nums.add("c");
        wordBreak(s, nums);
    }

    public static List<String> wordBreak(String s, List<String> wordDict) {
        ArrayList<String> ans = new ArrayList<>();
        if(wordDict.contains(s)) {
            ans.add(s);
        }
        if(hashMap.containsKey(s)) {
            return hashMap.get(s);
        }
        for(int i = 1; i < s.length(); i++) {
            String temp = s.substring(0, i);
            if(wordDict.contains(temp)) {
                List<String> list = wordBreak(s.substring(i), wordDict);
                hashMap.put(s.substring(i), list);
                if(list.size() != 0){
                    for(String sub : list){
                        ans.add(temp + " " + sub);
                    }
                }
            }
        }
        hashMap.put(s, ans);
        return ans;
    }

}