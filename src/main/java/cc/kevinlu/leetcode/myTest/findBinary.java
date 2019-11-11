package cc.kevinlu.leetcode.myTest;

public class findBinary {
    public static void main(String[] args) {
        int[] a = {5,6,7,8,9,10};
        //System.out.println(binaryFind(a,2, 0, a.length-1));
        System.out.println(binaryFind(a, 6));
    }
    //递归的二分查找
    public static int binaryFind(int[] a, int target, int left, int right){
        int middle = (left + right)/2;
        if(left >= right){ return -1;}
        if(target > a[middle]){
            return binaryFind(a, target, middle+1, right);
        }else if(target < a[middle]){
            return binaryFind(a, target, left, middle-1);
        }else{
            return middle;
        }
    }
    //非递归二分查找
    public static  int binaryFind(int[] a, int target){
        int start = 0, end =  a.length - 1;
        while(start < end){
            int middle = (start + end)/2;
            if(target < a[middle]){
                end = middle;
            }else if(target > a[middle]){
                start = middle;
            }else{
                return middle;
            }
        }
        return -1;
    }
}
