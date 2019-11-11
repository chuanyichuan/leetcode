package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainTest078 {

    public static void main(String[] args) {
        String path ="D/acas/asda.zip";
        String result = path.substring(path.lastIndexOf("/") + 1);
        System.out.println(result);

        String asd= "download.zip;end#faceall.zip;end#12";
                String[] das = asd.split(";end#");
   /*     int c =(3>>0)&1 ;
        if(((3>>0)&1 ) == 1)
        System.out.println(c);*/
        int [] bl = {1,2,3};
        //subsets(bl);
        subsetsdd(bl);
        //subsetBack(bl);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < 1 << nums.length; i++){
            List<Integer> now = new ArrayList<>();
            for(int j = 0; j < nums.length; j++){
                if(((i>>j) & 1) == 1){
                    now.add(nums[j]);
                }
            }
            ans.add(now);
        }
        return ans;
    }
    //递归实现
    public static List<List<Integer>> subsetsdd(int[] nums){
        Stack<Integer> now = new Stack<>();
        List<List<Integer>> ans = new ArrayList<>();
        subsetsTree(nums, 0 , ans, now);
        return ans;
    }

    public static  void subsetsTree(int[] nums,int i, List<List<Integer>> ans, Stack<Integer> now) {
        if(i == nums.length){
            ans.add(new ArrayList<>(now));
            return;
        }
        now.push(nums[i]);
        subsetsTree(nums, i+1, ans, now);
        now.pop();
        subsetsTree(nums, i+1, ans, now);
    }

    //回溯(很难想)
    public static List<List<Integer>> subsetBack(int[] nums){
        Stack<Integer> now = new Stack<>();
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, 0 ,now,ans);
        return ans;
    }

    public static void backtrack(int[] nums, int i, List<Integer> sub, List<List<Integer>> res) {
        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1]) continue;
            sub.add(nums[j]);
            res.add(new ArrayList<>(sub));
            backtrack(nums, j + 1, sub, res);
            sub.remove(sub.size() - 1);
        }
    }
}
