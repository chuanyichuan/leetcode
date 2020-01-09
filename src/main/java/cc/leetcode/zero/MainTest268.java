package cc.leetcode.zero;

/**
 * @author zero
 * @date 2020/1/9 2:09 下午
 */
public class MainTest268 {

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }


    /**
     * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
     *
     * 示例 1:
     *
     * 输入: [3,0,1]
     * 输出: 2
     * 示例 2:
     *
     * 输入: [9,6,4,2,3,5,7,0,1]
     * 输出: 8
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/missing-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    private static int missingNumber(int[] nums) {
        int targetCount = count(nums.length);
        int currenCount = 0;
        for (int num : nums) {
            currenCount += num;
        }
        return targetCount - currenCount;
    }


    private static int count(int n) {
        if (n != 1) {
            return count(n-1) + n;
        }else {
            return 1;
        }
    }
}
