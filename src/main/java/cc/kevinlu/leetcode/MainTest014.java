package cc.kevinlu.leetcode;

public class MainTest014 {
    public static void main(String[] args) {
        String[] strs = {"abab","aba",""};
        longestCommonPrefix(strs);
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        String ans = strs[0];
        for (int i = 1; i<strs.length ;i++){
            if(strs[i]=="")return "";
            for (int j = 0;j<ans.length()&&j<strs[i].length();){
                while(j<strs[i].length()&&j<ans.length()&&ans.charAt(j)==strs[i].charAt(j)){
                    j++;
                }
                ans = ans.substring(0,j);
                if(ans == "")return "";
            }
        }
        return ans;
    }
}
