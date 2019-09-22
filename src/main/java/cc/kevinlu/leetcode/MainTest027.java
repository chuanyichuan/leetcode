package cc.kevinlu.leetcode;

import java.util.Arrays;

public class MainTest027 {

    public static void main(String[] args) {
        int[] nums = { 1 };
        int val = 1;
        int index = removeElement(nums, val);
        for (int i = 0; i < index; i++) {
            System.out.print(nums[i] + ",");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            if (nums[i] != val) {
                i++;
                continue;
            }
            while (j >= 0) {
                if (nums[j] == val) {
                    j--;
                    continue;
                }
                nums[i] = nums[j];
                j--;
                break;
            }
        }
        return i;
    }

    public static int removeElement1(int[] nums, int val) {
        Arrays.sort(nums);
        int temp = 0, sub = 0, result = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = i;
            if (nums[i] == val)
                break;
            result++;
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            sub = j;
            if (nums[j] == val)
                break;
            result++;
        }
        if (result == nums.length * 2)
            return nums.length;
        for (int k = sub + 1; k < nums.length; k++) {
            nums[temp] = nums[k];
            temp++;
        }
        return result;
    }
}
