package Patterns;
import java.util.*;

public class NextPermutation {
    public void nextPerm(int[] nums){

        if(nums == null || nums.length <= 1) return;


        int i = nums.length-2;
        while( i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }

        if(i>=0){
            int j = nums.length-1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1); // i is the pivot and i+1 to length -1

    }

    private void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private  void  reverse(int[] nums , int start, int end){
        while(start < end){
            swap(nums,start++,end--);
        }
    }
    public static void main(String[] args) {
        NextPermutation sol = new NextPermutation();
        int[] nums = {1, 1,5,4,1};
        sol.nextPerm(nums);
        System.out.println(Arrays.toString(nums)); // Output: [1, 3, 2]
    }
}

