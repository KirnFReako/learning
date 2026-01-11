package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMIn {
    public static int[] MaxMin(int[] nums){

        int min = nums[0];
        int max = nums[0];

      for(int num : nums){
          if(num < min)min = num;
          if(num > max)max=num;
      }
      return new int[]{min,max};

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(MaxMin(nums)));
    }

}
