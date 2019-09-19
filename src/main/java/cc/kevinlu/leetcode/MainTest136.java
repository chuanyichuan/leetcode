package cc.kevinlu.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MainTest136 {

    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        System.out.println(singleNumber(nums));
    }

    /**
     * 异或：相同为0，不同为1. 异或同一个数两次，原数不变
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int r = nums[0];
        for (int i = 1; i < nums.length; i++) {
            r ^= nums[i];
        }
        return r;
    }

    public static int singleNumber1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.remove(n);
                continue;
            }
            map.put(n, n);
        }
        return map.keySet().iterator().next();
    }

}
