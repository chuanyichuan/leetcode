package cc.kevinlu.leetcode;

import java.util.List;

public class MainTest120 {
    public static void main(String[] args) {

    }

    //从顶点到右下角
    public static int minimumTotal(List<List<Integer>> triangle) {
        for (int i = 0; i < triangle.size(); i++) {
            int m = triangle.get(i).size();
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) continue;
                if (j == triangle.get(i).size() - 1) {
                    triangle.get(i).set(j, triangle.get(i).get(j) + triangle.get(i - 1).get(j - 1));
                }
                if (j == 0) {
                    triangle.get(i).set(j, triangle.get(i).get(j) + triangle.get(i - 1).get(j));
                }

                if (j > 0 && j < triangle.get(i).size() - 1) {
                    triangle.get(i).set(j, triangle.get(i).get(j)
                            + Math.min(triangle.get(i - 1).get(j - 1), triangle.get(i - 1).get(j)));
                }


            }
        }
        List<Integer> last = triangle.get(triangle.size() - 1);
        int temp = last.get(0);
        for (int i = 1; i < last.size(); i++) {
            if (last.get(i) < temp) {
                temp = last.get(i);
            }
        }
        return temp;
    }
}