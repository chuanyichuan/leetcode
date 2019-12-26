package cc.kevinlu.leetcode.knapsackProblem;

public class KnapsackProblem {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        int[] V = {1,2,3,4};
        int[] W = {2,4,4,5};
        System.out.println(knapsack01(n, m, V, W));
    }
    /**
     * 有N件物品和一个容量是V的背包。
     * 第i件物品的体积是vi，价值是wi.
     * 求将哪些物品装入背包，可以使得这些物品的总体积不超过背包容量，且总价值最大。
     * 输出最大价值
     *
     * 输入格式
     * 第一行两个整数，N V 用空格隔开，分别表示物品数量和背包容积。
     * 接下来有N行，每两个整数 vi wi，用空格隔开，分别表示第i件物品的体积价值。
     *
     * 输出格式
     * 输出一个整数 表示最大值
     *
     * 0 < N, V <= 1000
     * 0 < vi, wi <= 1000
     *
     * 输入样例
     * 4 5
     * 1 2
     * 2 4
     * 3 4
     * 4 5
     *
     * 输出样例
     * 8
     */


    /**
     * f[i][j]表示只看前i个物品，总体积是j的情况下，总价值最大是最少
     * result = max(f[n][0~v])
     * f[i][j]:
     *      1.不选第i个物品f[i][j] = f[i - 1][j]
     *      2.选第i个物品f[i][j] = f[i - 1][j - v[i]]
     * f[i][j] = max(1, 2)
     *
     * f[0][0] = 0;
     */
    //二维数组写法
    public static int knapsack01(int n, int m, int[] V, int[] W){
      /*  Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] V = new int[n];
        int[] W = new int[n];
        for(int i = 0; i < n; i++) {
            V[i] = input.nextInt();
            W[i] = input.nextInt();
        }*/
        int[][] fun = new int[n+1][m+1];
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= m; j++) {
                fun[i][j] = fun[i - 1][j];
                if(j >= V[i - 1]){
                    fun[i][j] = Math.max(fun[i][j], fun[i - 1][j - V[i - 1]] + W[i - 1]);
                }
            }
        }
        return fun[n][m];
    }


}