package ArrayProblems;

import java.util.HashMap;
import java.util.Map;

public class NrepeatedElementFreq {
    public static int repeat(int[] arr) {

        Map<Integer, Integer> count = new HashMap<>();

        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (int k : count.keySet()) {
            if (count.get(k) > 1) {
                return k;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,3};

        System.out.println(repeat(arr));
    }
}




