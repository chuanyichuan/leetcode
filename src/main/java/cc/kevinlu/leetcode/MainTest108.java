package cc.kevinlu.leetcode;

public class MainTest108 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5};
        sortedArrayToBST(nums);
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length);
    }

    private static TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start == end) {
            return null;
        }
        int mid = (start + end) >> 1;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid);
        root.right = sortedArrayToBST(nums, mid + 1, end);

        return root;
    }
}