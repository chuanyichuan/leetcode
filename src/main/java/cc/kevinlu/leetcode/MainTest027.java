package cc.kevinlu.leetcode;

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

}
