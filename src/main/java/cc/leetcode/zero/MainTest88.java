package cc.leetcode.zero;

/**
 * @author zero
 * @date 2020/1/2 10:22 下午
 */
public class MainTest88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);

    }

    /**
     * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            if (nums2[n] >= nums1[m]) {
                nums1[m + n + 1] = nums2[n];
                n--;
            }else {
                nums1[m + n + 1] = nums1[m];
                m--;
            }
        }
        while(n >= 0){
            nums1[m+n+1] = nums2[n];
            n--;
        }

//        int p = m-- + n-- - 1;
//        while (m >= 0 && n >= 0) {
//            nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
//        }
//
//        while (n >= 0) {
//            nums1[p--] = nums2[n--];
//        }
    }
}
