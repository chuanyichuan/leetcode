package cc.kevinlu.leetcode;

import javafx.util.Pair;

import java.util.*;

import static java.util.Arrays.asList;

public class MainTest127 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
        /*String beginWord = "abc";
        String endWord = "cgd";
        List<String> wordList = asList("abd","agd","cgd");*/
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = asList("hot","hkt","dot","dog","lot","log","cog");
        ladderLength(beginWord, endWord,wordList);
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int L = beginWord.length();
        // Dictionary to hold combination of words that can be formed,
        // from any given word. By changing one letter at a time.
        HashMap<String, ArrayList<String>> allComboDict = new HashMap<String, ArrayList<String>>();
        for (String s : wordList) {
            for (int i = 0; i < L; i++) {
                // Key is the generic word
                // Value is a list of words which have the same intermediate generic word.
                String newWord = s.substring(0, i) + '*' + s.substring(i + 1, L);
                ArrayList<String> transformations =
                        allComboDict.getOrDefault(newWord, new ArrayList<>());
                transformations.add(s);
                allComboDict.put(newWord, transformations);
            }
        }

        // Queue for BFS
        Queue<Pair<String, Integer>> Q = new LinkedList<Pair<String, Integer>>();
        Q.add(new Pair(beginWord, 1));

        // Visited to make sure we don't repeat processing same word.
        HashMap<String, Boolean> visited = new HashMap<String, Boolean>();
        visited.put(beginWord, true);

        while (!Q.isEmpty()) {
            Pair<String, Integer> node = Q.remove();
            String word = node.getKey();
            int level = node.getValue();
            for (int i = 0; i < L; i++) {

                // Intermediate words for current word
                String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);

                // Next states are all the words which share the same intermediate state.
                for (String adjacentWord : allComboDict.getOrDefault(newWord, new ArrayList<String>())) {
                    // If at any point if we find what we are looking for
                    // i.e. the end word - we can return with the answer.
                    if (adjacentWord.equals(endWord)) {
                        return level + 1;
                    }
                    // Otherwise, add it to the BFS Queue. Also mark it visited
                    if (!visited.containsKey(adjacentWord)) {
                        visited.put(adjacentWord, true);
                        Q.add(new Pair(adjacentWord, level + 1));
                    }
                }
            }
        }

        return 0;
    }



    //结合全排
    public static int ladderLengthsend(String beginWord, String endWord, List<String> wordList) {
        boolean[] status = new boolean[wordList.size()];
        Stack<String> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(!wordList.contains(endWord)) return 0;
        dfs(status, beginWord, endWord, wordList, stack, ans);
        if(ans.size() == 0) return 0;
        int min = ans.get(0);
        for(Integer temp : ans){
            if(temp < min){
                min = temp;
            }
        }
        return min;
    }
    public static void dfs(boolean[] status, String beginWord, String endWord, List<String> wordList, Stack<String> stack, ArrayList<Integer> ans){
        if(stack != null && stack.contains(endWord)){
            ans.add(stack.size() + 1);
            return;
        }
        for(int i = 0; i < wordList.size(); i++) {
            if(!status[i]){
                if(!isAdjacent(beginWord, wordList.get(i))){
                    continue;
                }
                status[i] = true;
                stack.push(wordList.get(i));
                dfs(status, wordList.get(i), endWord, wordList, stack,ans);
                status[i] = false;
                stack.pop();
            }
        }

    }
    public static boolean isAdjacent(String start, String nums){
        char[] st = start.toCharArray();
        char[] nu = nums.toCharArray();
        int ans = 0;
        for(int i = 0; i < st.length; i++) {
            if(st[i] != nu[i]){
                ans++;
            }
        }
        return ans > 1 ? false : true;
    }


   //全排
    public static List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] status = new boolean[nums.length];
        Stack<Integer> stack = new Stack<>();
        dfs(0, status, nums, ans, stack);
        return ans;
    }
    public static void dfs (int u, boolean[] status, int[] nums, List<List<Integer>> ans, Stack<Integer> stack){
        if (u == nums.length){
            ans.add(new ArrayList<>(stack));
            return;
        }
        for(int j = 0; j < nums.length; j++) {
            if(!status[j]){
                status[j] = true;
                stack.push(nums[j]);
                dfs(u + 1, status, nums, ans, stack);
                stack.pop();
                status[j] = false;
            }
        }
    }
}
