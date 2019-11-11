package cc.kevinlu.leetcode;

public class MainTest985 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        //System.out.println(queries.length);
        sumEvenAfterQueries(A, queries);
    }

    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int length = queries.length;
        int[] ans  = new int[length];
        for (int i = 0; i < length; i++) {
            A[queries[i][1]] = A[queries[i][1]] +queries[i][0];
            int result = 0;
            for(int j = 0; j<length; j++){
                if(A[j]%2 ==0){
                    result = result +A[j];
                }
            }
            ans[i] = result;
        }
        return ans;
    }
}
