package cc.kevinlu.leetcode;

public class MainTest313 {
    public static void main(String[] args) {
        int n = 7;
        int[] primes = {2, 3, 5};
        nthSuperUglyNumber(n, primes);
    }

    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int[] index = new int[primes.length];
        for (int i = 0; i < primes.length; i++) {
            index[i] = 0;
        }
        for (int i = 1; i < n; i++) {
            int ugly_index = 0;
            for (int j = 0; j < primes.length; j++) {
                if (ugly[index[j]] * primes[j] < ugly[index[ugly_index]] * primes[ugly_index]) {
                    ugly_index = j;
                }
            }
            ugly[i] = ugly[index[ugly_index]] * primes[ugly_index];
            for(int j = 0; j < primes.length; j++){
                if(ugly[index[j]] * primes[j] == ugly[i]){
                    index[j] += 1;
                }
            }
        }
        return ugly[n - 1];
    }
}