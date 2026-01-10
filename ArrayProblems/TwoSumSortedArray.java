package ArrayProblems;

import java.util.Arrays;

public class TwoSumSortedArray {
    public static int[] TwoSum(int[] arr , int K){
        // arr - 2,7,11,15  K =9
        int left =0, right = arr.length-1;

        int[] res =new int[2];

        while(left < right){
            int sum= arr[left] + arr[right];

            if(sum ==K){
                res[0] = left+1;
                res[1] = right+1;
                return res;
            }else if(sum < K){
                left++;
            }else {
                right--;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int K = 9;


        System.out.println(Arrays.toString(TwoSum(arr,K)));
    }


}
