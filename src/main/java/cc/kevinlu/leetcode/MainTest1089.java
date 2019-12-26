package cc.kevinlu.leetcode;

public class MainTest1089 {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4,5,0};
        //int arr[] = {0,1};
        duplicateZeros(arr);
        for(int a : arr){
            System.out.print(a+" ");
        }

    }

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0&&i<arr.length-1) {
                for (int j = arr.length - 1; j > i + 1; j--){
                    arr[j] = arr[j-1];
                }
                arr[i+1] = 0;
                i++;
            }
        }
    }
   /* public static void duplicateZeros(int[] arr){

    }*/
}
