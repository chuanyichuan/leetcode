package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainTest139 {
    public static void main(String[] args) {
        String s = "catsandog";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cats");
        wordDict.add("dog");
        wordDict.add("sand");
        wordDict.add("andog");
        wordDict.add("cat");
        wordBreak(s, wordDict);
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
       /* if(wordDict.contains(s))return true;
        for(int i = 1; i <= s.length(); i++){
            String temp = s.substring(0, i);
            String subTemp = s.substring(i);
            if(wordDict.contains(temp) && wordDict.contains(subTemp)){
                return true;
            }
            if(wordDict.contains(temp) && wordBreak(subTemp, wordDict)){
                return true;
            }
        }
        return false;*/
        HashMap<String, Boolean> hashMap = new HashMap<>();
        return dfs(s, wordDict, hashMap);
    }
    public static boolean dfs(String s, List<String> wordDict, HashMap<String, Boolean> hashMap){
        if(wordDict.contains(s))return true;
        for(int i = 1; i <= s.length(); i++){
            String temp = s.substring(0, i);
            String subTemp = s.substring(i);

            if(wordDict.contains(temp) && wordDict.contains(subTemp)){
                return true;
            }
            boolean curr;
            if(hashMap.containsKey(subTemp)){
                curr = hashMap.get(subTemp);
            } else {
                curr = dfs(subTemp, wordDict, hashMap);
                hashMap.put(subTemp, curr);
            }
            if(wordDict.contains(temp) && curr){
                return true;
            }
        }
        return false;
    }
}