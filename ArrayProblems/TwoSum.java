package ArrayProblems;
import java.util.*;

import java.util.HashMap;

public class TwoSum {
    public static int[] Twosum(int[] arr, int target){

        Map<Integer,Integer> mp = new HashMap<>();

        for(int i =0;i<arr.length;i++){
            int complement = target - arr[i];

            if(mp.containsKey(complement)){
                return new int[]{mp.get(complement),i};
            }
            mp.put(arr[i],i);
        }
        return new int[]{-1,-1};

    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(Twosum(arr,target)));
    }

}
